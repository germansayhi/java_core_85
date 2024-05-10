import org.w3c.dom.ls.LSOutput;

public class MethodDemo {
    public static void main(String[] args) {
        Math math = new Math();
        math.ShowPi();

        int max = math.max(1,10);
        System.out.println(max+ " = max");
    }

}

