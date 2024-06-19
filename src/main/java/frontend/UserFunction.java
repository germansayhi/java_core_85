package frontend;

import controller.UserController;
import entity.User;
import lombok.AllArgsConstructor;
import lombok.Generated;
import util.ScannerUtil;

@AllArgsConstructor

public class UserFunction {
    private UserController controller;

    public void showMenu() {
        while (true) {
            System.out.println("1. Đăng kí Fresh");
            System.out.println("2  Đăng kí Exprience");
            System.out.println("3. Đăng nhập");
            System.out.println("4. Đăng xuất");
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
        System.out.println("Vui lòng điền thông tin");
        System.out.println("Email:");
        String email = ScannerUtil.inputEmail();
        System.out.println("Password: ");
        String password = ScannerUtil.inputPassword();
        User user = controller.login(email, password);
        if (user == null) {
            System.err.println("Dang nhap that bai");
        } else {
            User.Candidate role = user.getCandidate();
            User.GraduationRank graduationRank = user.getGraduationRank();
            System.out.printf("Đăng nhập thành công: %s - %s.%n", user.getFirstname(), role);
        }
    }

    private void CreateFresherCandidate() {
        System.out.println("Vui lòng nhập thông tin của bạn");
        System.out.println("Tên của bạn:");
        String firstname = ScannerUtil.inputFullName();
        System.out.println("Họ của bạn: ");
        String lastname = ScannerUtil.inputFullName();
        System.out.println("Phone:");
        int phone = Integer.parseInt(ScannerUtil.inputPhoneNumber());
        System.out.println("Email");
        String email = ScannerUtil.inputEmail();
        System.out.println("Nhập vào mật khẩu của bạn");
        String password = ScannerUtil.inputPassword();
        System.out.println("Vui lòng chọn rank rank");
        System.out.println("1.EXCELLENCE");
        System.out.println("2.GOOD");
        System.out.println("3.FAIR");
        System.out.println("4.POOR");
        int graduationRank = ScannerUtil.inputInt();
        while (true) {
            if (graduationRank >= 1 && graduationRank <= 4) {
                break;
            } else {
                System.err.println("Giá trị không hợp lệ. Vui lòng nhập lại.");
            }
        }
        if (graduationRank == 1) {
            System.out.println(User.GraduationRank.EXCELLENCE);
        } else if (graduationRank == 2) {
            System.out.println(User.GraduationRank.GOOD);
        } else if (graduationRank == 3) {
            System.out.println(User.GraduationRank.FAIR);
        } else if (graduationRank == 4) {
            System.out.println(User.GraduationRank.POOR);
        }
        int result = controller.CreateFresherCandidate(firstname, lastname, phone, email, password, String.valueOf(graduationRank));
        System.out.printf("Đã tạo thành công %d user(s).%n", result);
    }

    private void CrateExperienceCandidate() {
        System.out.println("Vui lòng điền thông tin của bạn vào");
        System.out.println("Tên của ban:");
        String firstname = ScannerUtil.inputFullName();
        System.out.println("Họ của bạn: ");
        String lastname = ScannerUtil.inputFullName();
        System.out.println("Phone:");
        int phone = Integer.parseInt(ScannerUtil.inputPhoneNumber());
        System.out.println("Email");
        String email = ScannerUtil.inputEmail();
        System.out.println("Nhập vào mật khẩu của bạn");
        String password = ScannerUtil.inputPassword();
        System.out.println("Nhập skill cua bạn");
        String skill = ScannerUtil.inputFullName();
        System.out.println("Số năm kinh nghiệm");
        int exp = ScannerUtil.intNumber();
        int result = controller.CrateExperienceCandidate(firstname, lastname, phone, email, password, skill, exp);
        System.out.printf("Đã tạo thành công %d user(s).%n", result);
    }
}

