import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random  = new Random();
        int a = random.nextInt();
        System.out.println(a);
        // 0 <= ramdom.nextInt <= max
        int b = random.nextInt(100);
        System.out.println(b);

        // min <= ? <= max
        int min= 111;
        int max =999;
        int c = min +random.nextInt(max-min+1);
        System.out.println(c);

        String[] fruits= {"Cam","Quyt","Oi","Tao","Le"};
        String fruit = fruits[random.nextInt(fruits.length)];
        System.out.println("Fruit is "+fruit);

        //

    }
}
