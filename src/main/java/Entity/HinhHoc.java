package Entity;

public class HinhHoc {
    private static int wight;
    private static int height;
    public HinhHoc(int wight, int height) {
        this.wight = wight;
        this.height = height;
    }
    public static int tinhChuvi(){
        return 2*(wight+height);
    }

}
