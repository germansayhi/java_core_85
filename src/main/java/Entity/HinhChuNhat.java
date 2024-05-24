package Entity;

public class HinhChuNhat extends HinhHoc{
    private  double wight;
    private  double height;

    public HinhChuNhat(double wight, double height) throws HinhHocException {
        super();
        this.wight = wight;
        this.height = height;
    }

    public  double tinhChuVi(){
        return 2 * (height +wight);
    }
    public double tinhDienTich(){
        return wight*height;
    }
}
