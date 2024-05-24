package Entity;

public class HinhChuNhat extends HinhHoc{
    private static double wight;
    private static double height;

    public HinhChuNhat(double a, double b) throws HinhHocException {
        super();
    }

    public  double tinhChuVi(){
        return 2 * (height +wight);
    }
    public double tinhDienTich(){
        return wight*height;
    }
}
