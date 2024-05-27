import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CompartorDemo {
    public static void main(String[] args) {
        List<Cat> cats = new LinkedList<>();
        cats.add(new Cat(1, "A"));
        cats.add(new Cat(3, "w"));
        cats.add(new Cat(4, "r"));
        cats.add(new Cat(2, "e"));

        Comparator<Cat> comparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }
        };
        Collections.sort(cats,comparator);
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
