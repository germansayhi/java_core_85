import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private List<CanBo> canBoList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void showMenu () {
        while (true) {
            System.out.println("1.Them can bo");
            System.out.println("2.Tim kiem can bo theo ho ten");
            System.out.println("3. Hien thi danh sach can bo");
            System.out.println("4. Xoa can bo theo ten");
            System.out.println("5. Thoat chuong trinh");
            String menu = sc.nextLine();
            if (menu.equals("1")) {
                themCanbo();
            }else if (menu.equals("2")) {
                timKiemTheoHoTen();
            }else if (menu.equals("3")) {
               hienThiDSCB();
            }else if (menu.equals("4")) {
                xoaCanBoTheoTen();
            }else if (menu.equals("5")) {
                System.out.println("Vui long chon dung chuong trinh");
            }
        }
    }
    public void xoaCanBoTheoTen(){
        System.out.println("Nhap vao ten can xoa:");
        String nhap = sc.nextLine();
        canBoList.removeIf(canBo -> canBo.hoTen.contains(canBo.hoTen));
    }

    public void hienThiDSCB(){
        System.out.println("Danh sach can bo:");
        for (CanBo canBo : canBoList) {
            System.out.println(canBo);
        }
    }

    public void timKiemTheoHoTen(){
        System.out.println("Nhap vao ho va ten can tim:");
        String hoTen = sc.nextLine();
        for(CanBo canBo : canBoList){
            if(CanBo.hoTen.equals()){
                System.out.println(canBo);
            }

        }
    }

    public void themCanbo(){
        System.out.println("Chon loai can bo muon them");
        System.out.println("1. Cong Nhan");
        System.out.println("2. Ky Su");
        System.out.println("3. Nhan Vien");
        String menu = sc.nextLine();
        if(menu.equals("1")){
            CongNhan congNhan = nhapVaoCongNhan();
            canBoList.add(congNhan);
        }else if(menu.equals("2")){
            Kysu kySu = nhapVaoKySu();
            canBoList.add(kySu);
        }else if (menu.equals("3")){
            NhanVien nhanVien = nhapVaoNhanVien();
            canBoList.add(nhanVien);
        }
    }
    private CongNhan nhapVaoCongNhan(){
        System.out.println("Moi ban nhap vao thong tin cong nhan");
        System.out.println("Nhap vao ho ten");
        String hoTen = sc.nextLine();
        System.out.println("Nhap vao tuoi");
        int tuoi= Integer.parseInt(sc.nextLine());
        System.out.println("Chon gioi tinh");
        System.out.println("1.Nam");
        System.out.println("2.Nu");
        System.out.println("3.Khac");
        String menu = sc.nextLine();
        GioiTinh GioiTinh = null;
        if(menu.equals("1")){
            GioiTinh =GioiTinh.NAM;
        }else if(menu.equals("2")){
            GioiTinh = GioiTinh.NU;
        }else{
            GioiTinh =GioiTinh.KHAC;
        }
        System.out.println("Nhap vao dia chi");
        String diaChi = sc.nextLine();
        System.out.println("Nhap vao cap bac");
        int bac = Integer.parseInt(sc.nextLine());
        return new CongNhan(hoTen,tuoi,GioiTinh,diaChi,bac);

    }
    private Kysu nhapVaoKySu() {
        System.out.println("Mời bạn nhập vào thông tin công nhân.");
        System.out.println("Nhập vào họ tên:");
        String hoTen = sc.nextLine();
        System.out.println("Nhập vào tuổi:");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Chọn giới tính:");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. Khác");
        String menu = sc.nextLine();
        GioiTinh gioiTinh;
        if (menu.equals("1")) {
            gioiTinh = GioiTinh.NAM;
        } else if (menu.equals("2")) {
            gioiTinh = GioiTinh.NU;
        } else {
            gioiTinh = GioiTinh.KHAC;
        }
        System.out.println("Nhập vào địa chỉ:");
        String diaChi = sc.nextLine();
        System.out.println("Nhập vào ngành đạo tạo:");
        String nganhDaoTao = sc.nextLine();
        return new Kysu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
    }
    private NhanVien nhapVaoNhanVien() {
        System.out.println("Mời bạn nhập vào thông tin công nhân.");
        System.out.println("Nhập vào họ tên:");
        String hoTen = sc.nextLine();
        System.out.println("Nhập vào tuổi:");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Chọn giới tính:");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. Khác");
        String menu = sc.nextLine();
        GioiTinh gioiTinh;
        if (menu.equals("1")) {
            gioiTinh = GioiTinh.NAM;
        } else if (menu.equals("2")) {
            gioiTinh = GioiTinh.NU;
        } else {
            gioiTinh = GioiTinh.KHAC;
        }
        System.out.println("Nhập vào địa chỉ:");
        String diaChi = sc.nextLine();
        System.out.println("Nhập vào ngành đạo tạo:");
        String congViec = sc.nextLine();
        return new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
    }

}
