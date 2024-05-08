public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 10, 6};
        String[] names = new String[]{"DUC", "a"};

        int[] array = new int[5]; // 0 0 0 0 0

        // kich thuoc cua mang
        System.out.println(numbers.length);
        System.out.println(names.length);
        System.out.println(array.length);

        // Truy cap dua theo chi so index
        System.out.println(array[2]);
        System.out.println("name[1] = " + names[1]);

        int lastIndex = names.length - 1;
        System.out.println(" so cuoi cung " + names[lastIndex]);

        // Lap cac phan tu
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = numbers.length-1; i >= 0; i--) {
                System.out.println("numbers["+(numbers.length -1-i)+"] = "+numbers[i]);
        }
    }
}