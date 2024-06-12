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
    public List<User> findEmplyeeByProjectId(int projectId) {
        try {
            return repository.findEmployeeByProjectId(projectId);
        } catch (SQLException | IOException e) {
            return List.of();

        }
    }

    @Override
    public User findMangerByEmailAndPassWord(String email, String password){
        try {
            return repository.findMangerByEmailAndPassWord(email, password);
        } catch (SQLException | IOException e) {
           return null;
        }
    }

    @Override
    public List<User> findManager() {
        try {
            return repository.findManager();
        }catch (SQLException | IOException e){
            return List.of();
        }
    }
}
