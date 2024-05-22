public class Student {
    private String name;
    private int age;


    public static int count;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static int max(int a, int b){
        return a>b ?a:b;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
