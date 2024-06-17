package service;

import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface iUserService {

    User login(String email, String password);

    int CreateFresherCandidate(String firstname, String lastname, Integer phone, String email, String password, String graduationRank);

    int CrateExperienceCandidate(String firstname, String lastname, Integer phone, String email, String password, String proSkill, Integer exp);

}
