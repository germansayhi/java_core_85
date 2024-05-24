import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //Them phan tu vao cuoi hang doi
        queue.offer(3);
        queue.offer(2);
        queue.offer(5);
        queue.offer(7);

        System.out.println("queue = " + queue);

        // xem phan tu o dau hang doi
        int peek = queue.peek();
        System.out.println("queue.peek() = " +peek);

        //Lay phan tu o dau hang doi
        int poll = queue.poll();
        System.out.println("queue.poll() = " +poll);
        System.out.println(queue);

        // Xu ly queue
        while(!queue.isEmpty()){
            int top =queue.poll();
            System.out.println("top = " +top);
            System.out.println(queue);
        }


    }
}
