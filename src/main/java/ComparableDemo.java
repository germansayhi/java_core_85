import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo  {
    public static void main(String[] args) {
        List<Dog> dog1 = new ArrayList<>();
        dog1.add(new Dog(1,"shiba"));
        dog1.add(new Dog(2,"shiab"));
        dog1.add(new Dog(3,"A"));
        dog1.add(new Dog(4,"B"));
        dog1.add(new Dog(5,"C"));
        dog1.add(new Dog(6,"D"));
        dog1.add(new Dog(7,"E"));

        Collections.sort(dog1);
        for (Dog dog : dog1) {
            System.out.println("dog = " + dog);
        }
    }
}
