package repository;

import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface iUserRepository {
    List<User> findEmployeeByProjectId(int projectId) throws SQLException, IOException;

    List<User> findManager() throws SQLException, IOException;

    User findMangerByEmailAndPassWord(String email, String password) throws SQLException, IOException;

}
