import java.io.Serializable;

public class Account implements Serializable {
    private int id;
    private String name;
    private String username;
    private transient String password;

    public Account(int id, String name, String password, String username) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.username = username;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
