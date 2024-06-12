package frontend;

import controller.UserController;
import entity.User;
import lombok.AllArgsConstructor;
import util.ScannerUtil;

import java.util.List;

@AllArgsConstructor

public class UserFunction {
    private UserController controller;

    public void showMenu(){
        while (true) {
            System.out.println("1. Đăng nhập");
            System.out.println("2. Hiển thị danh sách Employee theo ProjectId");
            System.out.println("3. Danh sách Manger ");
            System.out.println("4. Đăng xuất ");
            System.out.println("Mời bạn chọn chức năng");
            int menu = ScannerUtil.inputInt();
            if(menu == 1){
                findManagerByIdAndPassword();
            }else if(menu ==2){
                findEmployeeByProjectId();
            }else if (menu ==3){
                findManager();
            }else {
                System.err.println("Vui lòng chọn lại");
                System.err.println("Nhập lại");
            }
        }
    }

    public void findEmployeeByProjectId() {
        System.out.println("Nhap vao project can tim:");
        int projectId =ScannerUtil.inputInt();
        List<User> users = controller.findEmplyeeByProjectId(projectId);
        System.out.println("Danh sach users: ");
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |        Full Name   |        Email       |");
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

    public void findManager() {
        List<User> users = controller.findManager();
        System.out.println("Danh sach Manager: ");
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |        Full Name   |        Email       |");
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

    private void findManagerByIdAndPassword(){
        System.out.println("Moi ban nhap vao thong tin");
        System.out.println("Email:");
        String email = ScannerUtil.inputEmail();
        System.out.println("Password: ");
        String password =ScannerUtil.inputPassword();
        User user = controller.findMangerByEmailAndPassWord(email,password);
        if(user == null){
            System.err.println("Dang nhap that bai");
        }else {
            User.Role role =user.getRole();
            System.out.printf("Dang nhap thanh cong: %s - %s.%n",user.getFullname(),role);
        }
    }


}
