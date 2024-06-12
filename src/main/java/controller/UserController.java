package controller;

import entity.User;
import lombok.AllArgsConstructor;
import service.iUserService;

import java.util.List;

@AllArgsConstructor
public class UserController implements iUserService {

    private iUserService service;

    public List<User> findEmplyeeByProjectId(int projectId)  {
        return service.findEmplyeeByProjectId(projectId);
    }

    public List<User> findManager() {
        return service.findManager();
    }

    public User findMangerByEmailAndPassWord(String email, String password) {
        return service.findMangerByEmailAndPassWord(email, password);
    }
}
