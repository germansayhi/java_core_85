import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
    //   Set<Integer> set = new LinkedHashSet<>();
       Set<Integer> set= new TreeSet<>();
        set.add(1);
        set.add(1);
        set.add(6);
        set.add(3);
        set.add(12);
        set.add(2);
        set.add(5);
        set.add(7);
        System.out.println(set);

    }
}
