package repository;

import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface iUserRepository {

    User login(String email, String password) throws SQLException, IOException;

    int CreateFresherCandidate(String firstname, String lastname, Integer phone, String email, String password,  String graduationRank) throws SQLException, IOException;

    int CrateExperienceCandidate(String firstname, String lastname, Integer phone, String email, String password, String proSkill, Integer exp)throws SQLException, IOException;
}
