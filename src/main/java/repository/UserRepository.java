package repository;

import entity.User;
import util.JdbcUtil;

import java.io.IOException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository implements iUserRepository {
    @Override
    public List<User> findEmployeeByProjectId(int projectId) throws SQLException, IOException {
        String sql = "select * from users WHERE project_id = ? AND role = 'EMPLOYEE'";
        try(
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql)
                ){
            pStmt.setInt(1,projectId);
            try(ResultSet rs = pStmt.executeQuery()) {
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
                user.setProjectId(rs.getInt("project_id"));

                users.add(user);
            }
            return users;
            }
        }
    }

    @Override
    public List<User> findManager() throws SQLException, IOException {
        String sql = "select * from users WHERE role = 'MANAGER'";
        try(
                Connection connection = JdbcUtil.getConnection();
                Statement Stmt = connection.createStatement();
                ResultSet rs = Stmt.executeQuery(sql)
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
                    user.setProjectId(rs.getInt("project_id"));

                    users.add(user);
                }
                return users;
            }
        }

    @Override
    public User findMangerByEmailAndPassWord(String email, String password) throws SQLException, IOException {
        String sql ="{CALL find_Manager_by_email_and_password(?,?)}";
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
                    user.setProjectId(rs.getInt("project_id"));
                    return user;
                }
                return null;
            }

        }

    }
}
