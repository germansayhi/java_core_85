import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâ vòa tên nguoi dung:  ");
        String name = sc.nextLine();
        System.out.println("ten cua nguoi dung: " + name);
        System.out.println(" nhap vao tuoi cua ban: ");
        int age = sc.nextInt();
        System.out.println(" so tuoi cua ban la"+ age);

    }
}
