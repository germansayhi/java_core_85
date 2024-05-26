package backend;

import entity.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Excercise01 {
    public static void Question01() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Duc"));
        students.add(new Student("Duke"));
        students.add(new Student("Duk"));
        students.add(new Student("Duck"));
        students.add(new Student("Duke"));
        students.add(new Student("Duk"));
        students.add(new Student("Duc"));
        students.add(new Student("Duke"));
        students.add(new Student("Duk"));
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + " Name: " + student.getName());
        }
        System.out.println("cau a");
        System.out.println("students.size() = " + students.size());

        System.out.println("cau b");
        Student Fouthstudent = students.get(3);
        System.out.println("Hoc sinh thu 4 la: " + Fouthstudent.getName());

        System.out.println("cau c");
        Student Firstname = students.get(0);
        System.out.println("Firstname.getName() = " + Firstname.getName());
        Student Lastname = students.get(students.size() - 1);
        System.out.println("Lastname.getName() = " + Lastname.getName());

        System.out.println("cau d");
        students.add(0, new Student("AAAAAA"));
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + " Name: " + student.getName());
        }

        System.out.println("cau e");
        students.add(new Student("BBBBB"));
        if (!students.isEmpty()) {
            Student last = students.get(students.size() - 1);
            System.out.println("last.getName() = " + last.getName());
        } else {
            System.out.println("Danh sach trong");
        }
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + " Name: " + student.getName());
        }

        System.out.println("cau f");
        Collections.reverse(students);
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + " Name: " + student.getName());
        }
        System.out.println("cau j");
    }

    public static Student findStudentByID(ArrayList<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) ;
            return student;
        }
        return null;

    }

    public static Student findStudentByName(ArrayList<Student> students, String name) {
        for (Student student : students) {
            if (student.getName() == name) ;
            return student;
        }
        return null;
    }
}
