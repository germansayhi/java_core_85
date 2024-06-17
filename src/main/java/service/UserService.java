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
}
