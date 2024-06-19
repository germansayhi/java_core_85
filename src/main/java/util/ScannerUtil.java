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

    public static String inputEmail(){
        while (true){
            String input = inputString();
            if(input.contains("@")){
                return input;
            }else {
                System.out.println("Email khong dung");
                System.err.println("Vui long nhap lai email: ");
            }
        }
    }

    public static String inputFullName(){
        while (true){
            String input = inputString();
            if(hasAllAnphabeticCharacter(input)){
                return input;
            }else {
                System.out.println("Vui long nhap lai ten cua ban: ");
                System.err.println("Nhap lai:");
             }
            }

    }

    private static boolean hasAllAnphabeticCharacter(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if(Character.isWhitespace(c)){
                continue;
            }
            if (!Character.isAlphabetic(c)) {
                return false;
            }
        }
        return true;
    }

    public static String inputPassword(){
        while (true){
            String input = inputString();
            int length = input.length();
            if(length <6 || length> 12){
                System.err.println("Yeu cau password dai tu 6 den 12 ki tu");
                System.err.println("Nhap lai");
            }else if(hasAnyUperCaseCharacter(input)){
                return input;
            }else {
                System.err.println("Yeu cau password chua 1 ki tu viet hoa");
                System.err.println("Nhap lai: ");
            }
        }
    }
    private static boolean hasAnyUperCaseCharacter(String s){
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
    }
    public static int intNumber(){
        while (true){
            int input =ScannerUtil.inputInt();
        if(input <0 || input >10){
            System.err.println("Vui lòng nhập lai;");
        }else if(input >0 || input <=10) {
            return input;
        }
        }
    }
    public static String inputPhoneNumber() {
        while (true) {
            boolean isNumber = true;
            String number = ScannerUtil.inputString();

            if (number.length() > 12 || number.length() < 9) {
                isNumber = false;
            }
            if (number.charAt(0) != '0') {
                isNumber = false;
            }

            // kiem tra co ki tu nao ko  phải la number ko
            for (int i = 0; i < number.length(); i++) {
                if (!Character.isDigit(number.charAt(i))) {
                    isNumber = false;
                    break;
                }
            }
            if (isNumber == true) {
                return number;
            } else {
                System.out.print("Nhập lại: ");
            }
        }
    }


}
