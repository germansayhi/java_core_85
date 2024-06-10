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
    public List<User> findAll()  {
        try {
            return repository.findAll();
        } catch (SQLException | IOException e) {
            return List.of();

        }
    }

    @Override
    public User findById(int id) {
        try {
            return repository.findById(id);
        } catch (SQLException | IOException e) {
            return null;
        }
    }

    @Override
    public User findByEmailAndByPassWord(String email, String password){
        try {
            return repository.findByEmailAndByPassWord(email, password);
        } catch (SQLException | IOException e) {
           return null;
        }
    }

    @Override
    public int Create(String fullName, String email){
        try {
            return repository.Create(fullName,email);
        } catch (SQLException | IOException e) {
            return 0;
        }
    }

    @Override
    public int deleteById(int id) {
        try {
            return repository.deleteById(id);
        } catch (SQLException | IOException e) {
            return 0;
        }
    }
}
