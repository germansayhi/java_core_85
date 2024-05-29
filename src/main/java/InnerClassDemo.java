public class InnerClassDemo {
    public static void main(String[] args) {
        Student student = new Student(1, "DUc");
        Student.Gender gender = student.new Gender("Male");
    }
}
