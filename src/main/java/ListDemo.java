import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
       // List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();

        // Them vao cuoi
        list.add("Con bo");
        list.add("Con trau");

        // Them vao vi tri bat ki
        list.add(1,"Con meo");
        System.out.println(list);

        // kich thuoc
        System.out.println(list.size());

        // Kiem tra rong

        System.out.println("list.isEmpty() = " + list.isEmpty());

        // Kiem tra chua phan tu
        System.out.println("list.contains(\"Con cho\") = " + list.contains("Con cho"));

        // Lay chi so cua 1 doi tuong
        System.out.println("list.indexOf(\"Con bo\") = " + list.indexOf("Con bo"));

        //Truy cap theo chi so
        System.out.println("list.get(2) = " + list.get(2));

        // Xoa theo chi so
        list.remove(2);

        // Xoa theo doi tuong
        list.remove("Con bo");

        // Xoa toan bo
        list.clear();

        // Xoa theo dieu kien
        list.removeIf(animal -> animal.length()>6);

        System.out.println(list);
    }
}
