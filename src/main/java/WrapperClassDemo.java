public class WrapperClassDemo {
    public static void main(String[] args) {
        /*
        * byte > Byte
        * short > Short
        * long > Long
        * int > Integer
        * boolean > Boolean
        * double > Double
        * char > Character
        * float > Float
        */

        // boxing: primive > wrapper class
        Integer b = Integer.valueOf(100);


        // unboxing : wrappr class > primive
        int i = b.intValue();

        // Bai toan String > number
        int c= Integer.valueOf("1000");


    }
}
