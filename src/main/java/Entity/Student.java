package Entity;

public class Student {
    private int id;
    private String name;


    public static String College;
    public static int moneyGroup;
    public static int count;

    public Student(String name) {
        count++;
        this.id = count;
        this.name = name;
    }

    public static String getCollege() {
        return College;
    }

    public static void setCollege(String college) {
        College = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
