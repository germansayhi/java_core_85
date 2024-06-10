package service;

import entity.User;

import java.util.List;

public interface iUserService {
    List<User> findAll();

    User findById(int id);

    User findByEmailAndByPassWord(String email, String password);

    int Create(String fullName, String email) ;

    int deleteById(int id) ;
}
