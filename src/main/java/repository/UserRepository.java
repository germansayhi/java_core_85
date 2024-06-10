package repository;

import entity.User;
import util.JdbcUtil;

import java.io.IOException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository implements iUserRepository {
    @Override
    public List<User> findAll() throws SQLException, IOException {
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

    @Override
    public User findById(int id) throws SQLException, IOException {
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

    @Override
    public User findByEmailAndByPassWord(String email, String password) throws SQLException, IOException {
        String sql ="{CALL find_by_email_and_password(?,?)}";
        try(
                Connection connection = JdbcUtil.getConnection();
                CallableStatement cStmt = connection.prepareCall(sql);
                ){
            cStmt.setString(1,email);
            cStmt.setString(2,password);
            try(ResultSet rs = cStmt.executeQuery()){
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

    @Override
    public int Create(String fullName, String email) throws SQLException, IOException {
        String sql = "INSERT INTO users( full_name, email) VALUES(?,?)";
        try (
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
                ){
            pStmt.setString(1,fullName);
            pStmt.setString(2,email);
            return pStmt.executeUpdate();
        }

    }

    @Override
    public int deleteById(int id) throws SQLException, IOException {
        String sql ="DELETE FROM users where id = ?";
        try (
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql)
        ){
            pstmt.setInt(1,id);
            return pstmt.executeUpdate();
        }

    }

}
