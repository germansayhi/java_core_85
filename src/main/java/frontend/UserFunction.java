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
            System.out.println("1. Đăng kí Fresh");
            System.out.println("2  Đăng kí Exprience");
            System.out.println("2. Đăng nhập");
            System.out.println("3. Đăng xuất");
            System.out.println("Mời bạn chọn chức năng");
            int menu = ScannerUtil.inputInt();
            if (menu == 1) {
                CreateFresherCandidate();
            } else if (menu == 2) {
                CrateExperienceCandidate();
            } else if (menu == 3) {
                login();
            }else if(menu ==4){
                return;
            } else {
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
        String password = ScannerUtil.inputPassword();
        User user = controller.login(email, password);
        if (user == null) {
            System.err.println("Dang nhap that bai");
        } else {
            User.Candidate role = user.getCandidate();
            System.out.printf("Dang nhap thanh cong: %s - %s.%n", user.getFirstname(), role);
        }
    }

    private void CreateFresherCandidate() {
        System.out.println("Vui long nhap thong tin");
        System.out.println("Tên của ban:");
        String firstname = ScannerUtil.inputFullName();
        System.out.println("Họ của bạn: ");
        String lastname = ScannerUtil.inputFullName();
        System.out.println("Phone:");
        int phone = ScannerUtil.inputInt();
        System.out.println("Email");
        String email = ScannerUtil.inputEmail();
        System.out.println("Nhập vào mật khẩu của bạn");
        String password = ScannerUtil.inputPassword();
        System.out.println("Vui long nhap trinh do");
        String graduationRank = ScannerUtil.inputFullName();
        int result = controller.CreateFresherCandidate(firstname, lastname, phone, email, password, graduationRank);
        System.out.printf("Đã tạo thành công %d user(s).%n", result);
    }

    private void CrateExperienceCandidate() {
        System.out.println("Vui long nhap thong tin");
        System.out.println("Tên của ban:");
        String firstname = ScannerUtil.inputFullName();
        System.out.println("Họ của bạn: ");
        String lastname = ScannerUtil.inputFullName();
        System.out.println("Phone:");
        int phone = ScannerUtil.inputInt();
        System.out.println("Email");
        String email = ScannerUtil.inputEmail();
        System.out.println("Nhập vào mật khẩu của bạn");
        String password = ScannerUtil.inputPassword();
        System.out.println("Nhap skill cua ban");
        String skill = ScannerUtil.inputFullName();
        System.out.println("So nam kinh nghiem");
        int exp = ScannerUtil.inputInt();
        int result = controller.CrateExperienceCandidate(firstname, lastname, phone, email, password, skill, exp);
        System.out.printf("Đã tạo thành công %d user(s).%n", result);
    }
}

