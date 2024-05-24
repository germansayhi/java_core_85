package Entity;

public abstract class HinhHoc extends Configs {
    private static int soLuongHinh = 0;

    public HinhHoc() throws HinhHocException {
        if (soLuongHinh >= Configs.SO_LUONG_HINH_TOI_DA) {
            throw new HinhHocException("Số lượng hình tối đa là: " + Configs.SO_LUONG_HINH_TOI_DA);
        }
        soLuongHinh++;
    }

    abstract double tinhChuVi();

    abstract double tinhDienTich();
}
