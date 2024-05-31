public class User {
    private int id;
    private String email;
    private String username;
    private String password;
    private Role role;

    public enum Role{
        ADMIN, EMPLOYEE
    }
}
