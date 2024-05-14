import java.util.Random;
import java.util.Scanner;

public class ExcerciseAss03 {
    void Question01(){
       float account1 = 5240.5f;
       float account2 = 10970.055f;

       int a= (int) account1;
       int b= (int) account2;
        System.out.println("Luong cua Account1: "+a+"$");
        System.out.println("Luong cua Account2: "+b+"$");
    }
    void Question02(){
        Random rand = new Random();
        int a = rand.nextInt(99999);
        String Number = String.format("%05d",a);
        System.out.println("Mot so ngau nhien 5 so: "+Number);
    }
    void Question03(){

    }
    void Question04(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so t1: ");
        float a = sc.nextInt();
        System.out.println("Nhap vao so t2: ");
        float b = sc.nextInt();
        float c = a/b;
        System.out.println("Thuong cua 2 so a va b: "+c);
    }
    void Question01EX2(){
        Integer LuongAcc1 = Integer.valueOf(5000);
        Float Luong1 = LuongAcc1.floatValue();
        System.out.printf("Luong cua ACC1: %.2f\n",Luong1);
    }
    void Question02EX2(){
        String a ="1234";
        Integer b = Integer.valueOf(a);
        System.out.println("b = " + b);
    }
    void Question03EX2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào họ và tên:");
        String s2 = sc.nextLine();
        String[] array = s2.split(" ");
        int count = 0;
        for (String word : array) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        System.out.println("Số từ: " + count);
    }
    Void Question04EX3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten cua ban: ");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Ky tu thu " + (i+1) + " la: " + name.charAt(i));
        }
        return null;
    }

}




