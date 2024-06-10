package repository;

import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface iUserRepository {
    List<User> findAll() throws SQLException, IOException;

    User findById(int id) throws SQLException, IOException;

    User findByEmailAndByPassWord(String email, String password) throws SQLException, IOException;

    int Create(String fullName, String email) throws SQLException, IOException;

    int deleteById(int id) throws SQLException, IOException;
}
