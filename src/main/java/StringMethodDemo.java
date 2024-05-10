import java.util.Locale;
import java.util.Scanner;

public class StringMethodDemo {
    public static void main(String[] args) {
        String s = "Java Core";
        String blank = "     ";
        String search = "      sam sung";
        String name = " Nguyen Van     A";



        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.length() = " + s.length());
        System.out.println("s.isEmpty() = " + s.isEmpty());
        System.out.println("blank.isBlank() = " + blank.isBlank());
        System.out.println("s.charAt(1) = " + s.charAt(1));
        System.out.println("s.indexOf('a') = " + s.indexOf('a'));
        System.out.println("s.contains(\"Core\") = " + s.contains("Core"));
        System.out.println("search.trim() = " + search.trim());
        String[] words = s.split(" ");
        for( String word : words ) {
            System.out.println("word = " + word);
        }
        // begin <= ....< end
        System.out.println("s.substring(0,4) = " + s.substring(0, 4));

        // Bai tap 1 khoa > Khoa
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap vao ten cua ban: ");
        String name1 = sc.nextLine();
       String a1= name1.substring(0,1).toUpperCase()
               + name1.substring(1).toLowerCase();
        System.out.println("Ten cua ban la: "+ a1);

        // Dem so tu trong ten
        System.out.println("Vui long nhap vao ten cua ban:");
        String s2 = sc.nextLine();
        String[] ten = s2.split(" ");
        int count = 0;
        for(String word : ten){
            if(!word.isEmpty()){
                count++;
            }

        }

        System.out.println("so tu la: "+ count);




    }
}