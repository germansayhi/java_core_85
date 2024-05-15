public class CongNhan extends CanBo{
    private int Bac;

    public CongNhan(String hoten, int tuoi, GioiTinh gioiTinh, String diaChi, int bac) {
        super(hoten, tuoi, gioiTinh, diaChi);
        Bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "Bac=" + Bac +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
