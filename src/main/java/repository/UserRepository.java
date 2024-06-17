package repository;

import entity.User;
import util.JdbcUtil;

import java.io.IOException;
import java.sql.*;

public class UserRepository implements iUserRepository {

    @Override
    public User login(String email, String password) throws SQLException, IOException {
        String sql = "{CALL find_by_email_and_password(?,?)}";
        try (
                Connection connection = JdbcUtil.getConnection();
                CallableStatement cStmt = connection.prepareCall(sql);
        ) {
            cStmt.setString(1, email);
            cStmt.setString(2, password);
            try (ResultSet rs = cStmt.executeQuery()) {
                if (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setFirstname(rs.getString("first_name"));
                    user.setLastname(rs.getString("last_name"));
                    user.setPhone(rs.getInt("phone"));
                    user.setEmail(rs.getString("email"));
                    user.setPassword(rs.getString("password"));
                    String Cadidate = rs.getString("candidate");
                    User.Candidate.valueOf(Cadidate);
                    user.setCandidate(User.Candidate.valueOf(Cadidate));
                    user.setProSkill(rs.getString("pro_skill"));
                    user.setExpInYear(rs.getInt("exp_in_year"));
                    user.setGraduationRank(rs.getString("graduationRank"));
                    return user;
                }
                return null;
            }
        }

    }


}


