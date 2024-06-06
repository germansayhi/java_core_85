package frontend;

import repository.UserRepository;
import util.JdbcUtil;
import util.ScannerUtil;

import java.sql.SQLException;

public class UserProgram {
    public static void main(String[] args) throws SQLException {
        UserRepository repository = new UserRepository();
        UserFunction function = new UserFunction(repository);
        while (true){
            System.out.println("Vui long chon chuc nang ban muon   ");
            System.out.println("1.Hien thi danh sach User");
            System.out.println("2.Tim kiem user theo id");
            System.out.println("3.Dang nhap");
            System.out.println("4.Dang xuat");
            int menu = ScannerUtil.inputInt();
            if (menu ==1){
                function.findAll();
            } else if (menu ==2) {
                function.findById();
            } else if (menu ==3) {
                function.findByIdAndPassword();
            } else if (menu ==4) {
                return;
            }else {
                System.err.println("Vui long chon dung chuc nang");
                System.err.println("Nhap lai");
            }
        }
    }
}
