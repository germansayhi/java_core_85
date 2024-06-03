package util;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    private static String inputString(){
        return scanner.nextLine()
                .trim()
                .replaceAll("\\s{2,}", " ");
    }
    public static int inputInt() {
        while (true){
            try {
                String input = inputString();
                return Integer.parseInt(input);
            }
            catch (NumberFormatException e) {
                System.err.println("Yeu cau nhap lai so nguyen");
                System.out.println("Moi ban nhap lai: ");
            }
        }
    }
}
