package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class User {
    private Integer id;
    private String fullname;
    private String email;
    private String password;
    private Role role;
    private String proSkill;
    private Integer expInYear;
    private Integer projectId;

    public enum Role{
        MANAGER,EMPLOYEE
    }
}
