public class BreakDemo {
    public static void main(String[] args) {
        for (int x = 0; x < 1000; x++) {
            if (x  == 5) {
                break;// thoat kho vong lap
            }
            System.out.println("x: " + x);

        }
    }
}
