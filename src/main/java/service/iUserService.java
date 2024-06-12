package service;

import entity.User;

import java.util.List;

public interface iUserService {
    List<User> findEmployeeAndManagerByProjectId(int projectId);


    User findAdminByEmailAndPassWord(String email, String password);

    int CreateEmployee(String fullname, String email);


}
