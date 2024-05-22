public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Duc", 20);
        Student s2 = new Student("Khoa", 22);

        s1.count =10;
        System.out.println(Student.count);

        // Truy cap thong qua class
        int max = Student.max(100, 32);
        System.out.println("max = " + max);

        //Static khong the truy cap non-static
        // Non-static co the truy cap static


    }
}