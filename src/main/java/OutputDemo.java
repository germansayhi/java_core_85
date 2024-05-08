import java.util.Locale;

public class OutputDemo {
    public static void main(String[] args) {
       //Escape character
        /*
        \" ->"
        \' ->'
        \\ -> \
        \n -> xuong dong
        \t -> tab
         */

        //System.out.print
        System.out.println("\"java\"Core");
        System.out.println("\"java\"Core");

        //System.out.println
        System.out.println("Hello World");
        //System.out.printf
        /*
        *   %d: Số nguyên (byte, short, int, long)
         %f: Số thực (float, double)
         %s: String
        %c: kí tự (char)
        / %n: Xuống dòng
        */

        String name ="DUc";
        int age = 20;
        System.out.println("tên ban là: "+ name+", tuoi của ban là: " +age);
        System.out.printf("tên của ban la %s, tuoi la &d ",name,age);

        // làm trò so
        System.out.printf("PI = %.3f%n",3.123456);
        // Nhom 3 so
        System.out.printf(Locale.CHINA, "Money = %,d%n",3123456);
        System.out.printf(Locale.ITALY,"Money = %,d%n",3123456);
        // Nhom in hoa
        System.out.printf("Ten: %S%n", "khoa");




    }
}
