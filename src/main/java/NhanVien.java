public class NhanVien extends CanBo {
    private String CongViec;

    public NhanVien(String hoten, int tuoi, GioiTinh gioiTinh, String diaChi, String congViec) {
        super(hoten, tuoi, gioiTinh, diaChi);
        CongViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "CongViec='" + CongViec + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
