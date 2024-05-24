package Backend;

import Entity.*;

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
    public static void question06(){
        var primaryStudent = new PrimaryStudent("Nguyen Van A");
        var primaryStudent1 = new PrimaryStudent("Nguyen Van G");
        var SecondStudent2 = new SecondaryStudent("Nguyen Van F");
        var SecondStudent3 = new SecondaryStudent("Nguyen Van E");
        var SecondStudent4 = new SecondaryStudent("Nguyen Van D");
        var SecondStudent5 = new SecondaryStudent("Nguyen Van C");

        System.out.println("primaryStudent1 = " + primaryStudent1);
        System.out.println("primaryStudent2 = " + SecondStudent2);
        System.out.println("primaryStudent3 = " + SecondStudent3);
        System.out.println("primaryStudent4 = " + SecondStudent4);
        System.out.println("primaryStudent5 = " + SecondStudent5);
        System.out.println("primaryStudent = " + primaryStudent);
        System.out.println("PrimaryStudent.count = " + PrimaryStudent.count);
    }
    public static void question07(){
        try{
            HinhTron s1 = new HinhTron(2);
            System.out.println("s1.tinhChuVi() = " + s1.tinhChuVi());
            System.out.println("s1.tinhDienTich() = " + s1.tinhDienTich());
            HinhTron s2 = new HinhTron(4);
            System.out.println("s2.tinhDienTich() = " + s2.tinhDienTich());
            System.out.println("s2.tinhChuVi() = " + s2.tinhChuVi());
            HinhChuNhat s3 = new HinhChuNhat(10,2);
            System.out.println("s3.tinhChuVi() = " + s3.tinhChuVi());
            System.out.println("s3.tinhDienTich() = " + s3.tinhDienTich());
            HinhTron s4 = new HinhTron(3);
            System.out.println("s4 = " + s4.tinhChuVi());
            System.out.println("s4.tinhDienTich() = " + s4.tinhDienTich());
            HinhTron s5 = new HinhTron(6);
            System.out.println("s5.tinhDienTich() = " + s5.tinhDienTich());
            System.out.println("s5.tinhChuVi() = " + s5.tinhChuVi());
        } catch (HinhHocException e) {
            System.out.println(e.getMessage());
        }

    }
}



