package controller;

import entity.User;
import lombok.AllArgsConstructor;
import service.iUserService;

import java.io.IOException;
import java.sql.SQLException;

@AllArgsConstructor
public class UserController implements iUserService {
    private iUserService service;


    @Override
    public User login(String email, String password)  {
        return service.login(email, password);

    }

    @Override
    public int CreateFresherCandidate(String firstname, String lastname, Integer phone, String email, String password, String graduationRank) {
        return service.CreateFresherCandidate(firstname, lastname, phone, email, password,graduationRank);
    }

    @Override
    public int CrateExperienceCandidate(String firstname, String lastname, Integer phone, String email, String password, String proSkill, Integer exp) {
        return service.CrateExperienceCandidate(firstname, lastname, phone, email, password, proSkill, exp);
    }
}