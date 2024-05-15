public class Kysu extends CanBo {
    private String NganhDaoTao;

    public Kysu(String hoten, int tuoi, GioiTinh gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoten, tuoi, gioiTinh, diaChi);
        NganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "Kysu{" +
                "NganhDaoTao='" + NganhDaoTao + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
