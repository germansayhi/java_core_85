import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Thêm phần tử vào đỉnh
        stack.push(2);
        stack.push(8);
        stack.push(3);
        stack.push(5);

        System.out.println(stack);

        // Xem phần tử ở đỉnh
        int peek = stack.peek();
        System.out.println("peek = " + peek);

        System.out.println(stack);

        // Lấy phần tử ở đỉnh
        int pop = stack.pop();
        System.out.println("pop = " + pop);

        System.out.println(stack);

        // Xử lý stack
        while (!stack.empty()) {
            int top = stack.pop();
            System.out.println("top = " + top);
            System.out.println(stack);
        }
    }
}
