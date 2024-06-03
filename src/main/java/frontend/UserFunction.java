package frontend;

import entity.User;
import lombok.AllArgsConstructor;
import repository.UserRepository;
import util.ScannerUtil;

import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor

public class UserFunction {
    private UserRepository repository;
    public void findAll() throws SQLException {
        List<User> users = repository.findAll();
        System.out.println("Danh sach users: ");
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |        Full Name   |             Email  |");
        System.out.println("+------+--------------------+--------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-18s | %-18s |%n","NUL","NULL","NULL");
            System.out.println("+------+--------------------+--------------------+");
        }else {
            for (User user : users) {
                int id = user.getId();
                String fullname = user.getFullname();
                String email = user.getEmail();
                System.out.printf("| %-4s | %-18s | %-18s |%n", id, fullname, email);
                System.out.println("+------+--------------------+--------------------+");
            }
        }
    }

    public void findById() throws SQLException {
        System.out.printf("Nhap vao id can tim:");
        int id = ScannerUtil.inputInt();
        User user = repository.findById(id);
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |        Full Name   |             Email  |");
        System.out.println("+------+--------------------+--------------------+");
        if (user == null){
            System.out.printf("| %-4s | %-18s | %-18s |%n","NUL","NULL","NULL");
            System.out.println("+------+--------------------+--------------------+");
        }else{
            String fullname = user.getFullname();
            String email = user.getEmail();
            System.out.printf("| %-4s | %-18s | %-18s |%n",id,fullname,email);
            System.out.println("+------+--------------------+--------------------+");
        }
    }

}
