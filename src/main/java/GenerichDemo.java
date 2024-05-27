public class GenerichDemo {
    public static void main(String[] args) {

        // T: Type
        // E: Element
        // N: Number
        // K: key
        // V: Value
        Circle<Integer> c1 = new Circle<>(10, "red");
        System.out.println("c1 = " + c1);
        Circle<Double> c2 = new Circle<>(10.5,"a");
        System.out.println("c2 = " + c2);

        MyMath<String, String> math = new MyMath<>("Duc", "aaaaaa");
        System.out.println("math = " + math);

        Print("A");
        Print(1);

        // Wildcarldcard: extends, super, ?

        Circle<Double> c3 = new Circle<>(10.8, "red");


    }
    public static <T> void Print(T type){
        System.out.println(type);
    }
}