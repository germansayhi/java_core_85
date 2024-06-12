package service;

import entity.User;

import java.util.List;

public interface iUserService {
    List<User> findEmplyeeByProjectId(int projectId);

    List<User> findManager();

    User findMangerByEmailAndPassWord(String email, String password);


}
