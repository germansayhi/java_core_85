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
}