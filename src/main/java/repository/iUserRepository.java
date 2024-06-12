package repository;

import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface iUserRepository {
    List<User> findEmployeeAndManagerByProjectId(int projectId) throws SQLException, IOException;

    User findAdminByEmailAndPassWord(String email, String password) throws SQLException, IOException;

    int CreateEmployee(String fullname, String email) throws SQLException, IOException;

}
