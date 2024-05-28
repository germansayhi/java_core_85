package entity;

public class Excercise04 {
    public static void Question01(){
        Salary<Double> n1 = new Salary<>(1.1d);
        Salary<Float> n2 = new Salary<>(1.2f);
        Print(n1);
        Print(n2);
    }
    public static <E> void Print (E type){
        System.out.println(type);
    }
}
