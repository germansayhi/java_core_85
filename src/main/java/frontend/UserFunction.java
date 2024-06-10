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
            System.out.println("2. Hiện thi danh sách users theo id");
            System.out.println("3. Tim kiếm users theo id");
            System.out.println("4. Đăng xuất ");
            System.out.println("Moi ban chon chuc nang");
            int menu = ScannerUtil.inputInt();
            if(menu == 1){
                findByIdAndPassword();
            }else if(menu ==2){
                findAll();
            }else if(menu == 3){
                findById();
            }else if (menu ==4){
                return;
            }else {
                System.err.println("Vui long nhap chon dung chuc nang");
                System.err.println("Nhap lai");
            }
        }
    }

    public void findAll() {
        List<User> users = controller.findAll();
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

    public void showAdminMenu() {
        while (true) {
            System.out.println("1.Hien thi danh sach Users");
            System.out.println("2.Tim kien users theo id");
            System.out.println("3. Them users");
            System.out.println("4.Xoa user theo id");
            System.out.println("5. Dang xuat");
            System.out.println("Moi ban chon chuc nang");
            int menu = ScannerUtil.inputInt();
            if(menu == 1){
                findAll();
            }else if(menu ==2){
                findById();
            }else if(menu == 3){
                Create();
            }else if (menu ==4){
                deleteByID();
            }else if (menu ==5){
                return;
            }else {
                System.err.println("Vui long nhap chon dung chuc nang");
                System.err.println("Nhap lai");
            }
        }
    }

    public void showEmployeeMenu() {
        while (true){
            System.out.println("1.Hien thi danh sach Users");
            System.out.println("2.Tim kien users theo id");
            System.out.println("3. Dang xuat");
            System.out.println("Moi ban chon chuc năng");
            int menu = ScannerUtil.inputInt();
            if(menu ==1){
                findAll();
            } else if (menu ==2) {
                findById();
            } else if (menu ==3) {
                return;
            }else {
                System.err.println("Vui long chon dung chuc nang");
                System.err.println("Nhap lai");
            }
        }
    }

    private void findById() {
        System.out.printf("Nhap vao id can tim:");
        int id = ScannerUtil.inputInt();
        User user = controller.findById(id);
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

    private void findByIdAndPassword(){
        System.out.println("Moi ban nhap vao thong tin");
        System.out.println("Email:");
        String email = ScannerUtil.inputEmail();
        System.out.println("Password: ");
        String password =ScannerUtil.inputPassword();
        User user = controller.findByEmailAndByPassWord(email,password);
        if(user == null){
            System.err.println("Dang nhap that bai");
        }else {
            User.Role role =user.getRole();
            System.out.printf("Dang nhap thanh cong: %s - %s.%n",user.getFullname(),role);
            if (role == User.Role.ADMIN){
                showAdminMenu();
            }else if(role == User.Role.EMPLOYEE){
                showEmployeeMenu();
            }
        }
    }

    public void Create() {
        System.out.println("moi ban nhap vao thong tin:");
        System.out.println("Moi ban vao nhap ten:");
        String fullName = ScannerUtil.inputFullName();
        System.out.println("Moi ban vao nhap email:");
        String emai = ScannerUtil.inputEmail();
        int result = controller.Create(fullName, emai);
        System.out.printf("Da tao thanh cong %d user(s).%n", result);

    }

    private void deleteByID() {
        System.out.println("Nhap vao id can xoa:");
        int id = ScannerUtil.inputInt();
        int result = controller.deleteById(id);
        System.out.printf("Da xoa thanh cong %d user(s).%n",result);

    }
}
