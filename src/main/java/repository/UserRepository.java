package repository;

import entity.User;
import util.JdbcUtil;

import java.io.IOException;
import java.sql.*;

public class UserRepository implements iUserRepository {

    @Override
    public User login(String email, String password) throws SQLException, IOException {
        String sql = "SELECT * FROM users where email =? and password = ?";
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
                    String GraduationRank = rs.getString("graduationRank");
                    User.GraduationRank.valueOf(GraduationRank);
                    return user;
                }
                return null;
            }
        }

    }

    @Override
    public int CreateFresherCandidate(String firstname, String lastname, Integer phone, String email, String password, String graduationRank) throws SQLException, IOException {
        String sql = "INSERT INTO users( first_name,last_name,phone, email, password,graduationRank) VALUES(?,?,?,?,?,?)";
        try (
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
        ){
            pStmt.setString(1,firstname);
            pStmt.setString(2,lastname);
            pStmt.setInt(3,phone);
            pStmt.setString(4,email);
            pStmt.setString(5,password);
            pStmt.setString(6,graduationRank);
            return pStmt.executeUpdate();
        }
    }

    @Override
    public int CrateExperienceCandidate(String firstname, String lastname, Integer phone, String email, String password, String proSkill, Integer exp) throws SQLException, IOException {
        String sql = "INSERT INTO users( first_name,last_name,phone, email, password, pro_skill, exp_in_year,candidate) VALUES(?,?,?,?,?,?,?,'EXPERIENCECANDIDATE')";
        try (
                Connection connection = JdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
        ){
            pStmt.setString(1,firstname);
            pStmt.setString(2,lastname);
            pStmt.setInt(3,phone);
            pStmt.setString(4,email);
            pStmt.setString(5,password);
            pStmt.setString(6,proSkill);
            pStmt.setInt(7,exp);
            return pStmt.executeUpdate();
        }
    }


}


