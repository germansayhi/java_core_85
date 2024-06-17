package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class User {
    private Integer id;
    private String firstname;
    private String lastname;
    private Integer phone;
    private String email;
    private String password;
    private Candidate Candidate;
    private String proSkill;
    private Integer expInYear;
    private Integer projectId;
    private String graduationRank;

    public enum Candidate{
        EXPERIENCECANDIDATE,FRESHCANDIDATE
    }
}
