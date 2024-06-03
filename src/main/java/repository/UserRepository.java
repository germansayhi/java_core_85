package repository;

import entity.User;
import util.JdbcUtil;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {
    public List<User> findAll() throws SQLException {
        String sql = "select * from users";
        try(
                Connection connection = JdbcUtil.getConnection();
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                ){
            List<User> users = new LinkedList<>();
            while (rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setFullname(rs.getString("full_name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                String role = rs.getString("role");
                User.Role.valueOf(role);
                user.setRole(User.Role.valueOf(role));
                user.setProSkill(rs.getString("pro_skill"));
                user.setExpInYear(rs.getInt("exp_in_year"));

                users.add(user);
            }
            return users;
        }
    }

    public User findById(int id) throws SQLException {
        String sql = "SELECT * FROM users WHERE id = ?";
        try(
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
                ){
            statement.setInt(1, id);
            try(ResultSet rs = statement.executeQuery()){
                if (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setFullname(rs.getString("full_name"));
                    user.setEmail(rs.getString("email"));
                    user.setPassword(rs.getString("password"));
                    String role = rs.getString("role");
                    User.Role.valueOf(role);
                    user.setRole(User.Role.valueOf(role));
                    user.setProSkill(rs.getString("pro_skill"));
                    user.setExpInYear(rs.getInt("exp_in_year"));
                    return user;
                }
                return null;
            }
        }
    }
}
