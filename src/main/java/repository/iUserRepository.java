package repository;

import entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface iUserRepository {

    User login(String email, String password) throws SQLException, IOException;
}
