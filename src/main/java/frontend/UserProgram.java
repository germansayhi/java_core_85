package frontend;

import repository.UserRepository;
import util.JdbcUtil;

import java.sql.SQLException;

public class UserProgram {
    public static void main(String[] args) throws SQLException {
        UserRepository repository = new UserRepository();
        UserFunction function = new UserFunction(repository);
        function.findAll();
        function.findById();
    }
}
