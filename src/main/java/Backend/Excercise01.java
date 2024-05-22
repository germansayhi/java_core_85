package Backend;

import Entity.Student;

public class Excercise01 {
    public static void question01(){
        Student s1 = new Student("Nguyen Van A");
        Student s2 = new Student("Nguyen Van V");
        Student s3 = new Student("Nguyen Van Z");
        Student s4 = new Student("Nguyen Van C");
        Student s5 = new Student("Nguyen Van E");
        Student s6 = new Student("Nguyen Van D");
        Student s7 = new Student("Nguyen Van S");
        Student s8 = new Student("Nguyen Van A");
        Student[] students ={s1,s2,s3};

        Student.College =" Dai hoc bach khoa";
        System.out.println("s1 = " + s1.College);
        System.out.println("s2 = " + s2.College);
        System.out.println("s3 = " + s3.College);

        Student.College =" Dai hoc cong nghe";
        System.out.println("s1 = " + s1.College);
        System.out.println("s2 = " + s2.College);
        System.out.println("s3 = " + s3.College);
    }
    public static void question02(){
        Student s1 = new Student("Nguyen Van A");
        Student s2 = new Student("Nguyen Van V");
        Student s3 = new Student("Nguyen Van Z");

        s1.moneyGroup += 100;
        s2.moneyGroup += 100;
        s3.moneyGroup += 100;
        System.out.println("Quy lop co = " + Student.moneyGroup);

        s1.moneyGroup -=50;
        System.out.println("Quy lop con = " + s1.moneyGroup);

        s2.moneyGroup -=20;
        System.out.println("Quy lop: " + Student.moneyGroup);

        s3.moneyGroup -=150;
        System.out.println("\"Quy lop\" = " + Student.moneyGroup);

        s1.moneyGroup += 150;
        s2.moneyGroup += 150;
        s3.moneyGroup += 150;
        System.out.println("Quy lop: " +Student.moneyGroup);
    }
    public static void question05(){
        Student s1 = new Student("Nguyen Van A");
        Student s2 = new Student("Nguyen Van V");
        Student s3 = new Student("Nguyen Van Z");
        Student s4 = new Student("Nguyen Van C");
        Student s5 = new Student("Nguyen Van E");
        Student s6 = new Student("Nguyen Van D");
        Student s7 = new Student("Nguyen Van S");
        Student s8 = new Student("Nguyen Van A");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println("Student.count = " + Student.count);

    }
}



