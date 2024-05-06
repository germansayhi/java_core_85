public class ContinueDemo {
    public static void main(String[] args) {
        for (int x = 0; x < 10; x++) {
            if (x == 5) {
                continue;// Next
            }
            System.out.println("x: " + x);

        }
    }
}
