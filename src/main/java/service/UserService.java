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
    public List<User> findEmployeeAndManagerByProjectId(int projectId) {
        try {
            return repository.findEmployeeAndManagerByProjectId(projectId);
        } catch (SQLException | IOException e) {
            return List.of();

        }
    }

    @Override
    public User findAdminByEmailAndPassWord(String email, String password){
        try {
            return repository.findAdminByEmailAndPassWord(email, password);
        } catch (SQLException | IOException e) {
           return null;
        }
    }

    @Override
    public int CreateEmployee(String fullname, String email) {
        try {
            return repository.CreateEmployee(fullname, email);
        } catch (SQLException | IOException e) {
            return 0;
        }
    }
}
