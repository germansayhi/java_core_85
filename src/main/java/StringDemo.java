public class StringDemo {
    public static void main(String[] args) {
        // Primive
        String S1 = "Hello World";
        String S2 = "Hello World";
        // Non Primive
        String S3 = new String("Hello World");
        String S4 = new String("Hello World");
        System.out.println(S1.equals(S2));
        System.out.println(S1.equals(S3));
        System.out.println(S1.equals(S4));

    }
}
