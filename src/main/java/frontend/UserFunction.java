package frontend;

import controller.UserController;
import entity.User;
import lombok.AllArgsConstructor;
import util.ScannerUtil;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor

public class UserFunction {
    private UserController controller;

    public void showMenu() {
        while (true) {
            System.out.println("1. Đăng nhập");
            System.out.println("Mời bạn chọn chức năng");
            int menu = ScannerUtil.inputInt();
            if(menu == 1){
               login();
            }else {
                System.err.println("Vui lòng chọn lại");
                System.err.println("Nhập lại");
            }
        }
    }

    private void login() {
        System.out.println("Moi ban nhap vao thong tin");
        System.out.println("Email:");
        String email = ScannerUtil.inputEmail();
        System.out.println("Password: ");
        String password =ScannerUtil.inputPassword();
        User user = controller.login(email,password);
        if(user == null){
            System.err.println("Dang nhap that bai");
        }else {
            User.Candidate role =user.getCandidate();
            System.out.printf("Dang nhap thanh cong: %s - %s.%n",user.getFirstname(),role);
        }
    }



}
