package Entity;

public abstract class HinhHoc extends Configs {
    private static int soLuongHinh;

    public HinhHoc() throws HinhHocException {
        if (soLuongHinh >= Configs.SO_LUONG_HINH_TOI_DA) {
            throw new HinhHocException("Số lượng hình tối đa là: " + Configs.SO_LUONG_HINH_TOI_DA);
        }
        soLuongHinh++;
    }

    public abstract double tinhChuVi();

    public abstract double tinhDienTich();
}
