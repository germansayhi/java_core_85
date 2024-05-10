public class CastingDemo {
    public static void main(String[] args) {
        // Widening
        //byte > short > int > long > float > double
        int a = 1000;
        long b = (long)a;
        System.out.println(b);
        /*
        * Narrowing
        * double > float > long > int > short > byte
        * */
        long c = 8000000000L;
        int d= (int)c;
        System.out.println(d);

        // Bai Toan
        int x=1;
        int y=2;
        System.out.println((float) x/y);
        System.out.println(x/(float)y);

    }
}
