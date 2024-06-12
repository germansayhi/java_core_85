package controller;

import entity.User;
import lombok.AllArgsConstructor;
import service.iUserService;

import java.util.List;

@AllArgsConstructor
public class UserController implements iUserService {

    private iUserService service;

    @Override
    public List<User> findEmployeeAndManagerByProjectId(int projectId) {
        return service.findEmployeeAndManagerByProjectId(projectId);
    }

    @Override
    public User findAdminByEmailAndPassWord(String email, String password) {
        return service.findAdminByEmailAndPassWord(email, password);
    }

    @Override
    public int CreateEmployee(String fullname, String email) {
        return service.CreateEmployee(fullname, email);
    }
}
