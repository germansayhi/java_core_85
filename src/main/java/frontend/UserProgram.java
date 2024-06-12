package frontend;

import controller.UserController;
import repository.UserRepository;
import repository.iUserRepository;
import service.UserService;
import service.iUserService;

public class UserProgram {
    public static void main(String[] args)  {
        iUserRepository repository = new UserRepository();
        iUserService service = new UserService(repository);
        UserController controller = new UserController(service);
        UserFunction function = new UserFunction(controller);
        function.showMenu();
    }
}
