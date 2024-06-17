package service;

import entity.User;
import lombok.AllArgsConstructor;
import repository.iUserRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor

public class UserService implements iUserService {

    private iUserRepository repository;

    @Override
    public User login(String email, String password){
        try {
            return repository.login(email,password);
        } catch (SQLException | IOException e) {
           return null;
        }
    }

    @Override
    public int CreateFresherCandidate(String firstname, String lastname, Integer phone, String email, String password, String graduationRank)  {
        try {
            return repository.CreateFresherCandidate(firstname, lastname, phone, email, password,graduationRank);
        } catch (SQLException | IOException e) {
            return 0;
        }
    }

    @Override
    public int CrateExperienceCandidate(String firstname, String lastname, Integer phone, String email, String password, String proSkill, Integer exp) {
        try{
            return repository.CrateExperienceCandidate(firstname, lastname, phone, email, password, proSkill, exp);
        }catch (SQLException | IOException e) {
            return 0;
        }
    }
}
