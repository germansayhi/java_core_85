package Entity;

public class HinhTron extends HinhHoc{
    private static int banKinh;

    public HinhTron(int banKinh) throws HinhHocException {
        super();
        this.banKinh = banKinh;
    }
    public double tinhChuVi(){
        return 2 * Math.PI * banKinh;
    }
    public double tinhDienTich(){
        return Math.PI *Math.pow(banKinh,2);
    }
}
