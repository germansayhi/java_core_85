package backend;

import entity.Student;

import java.util.*;
import java.util.Map;

public class Excercise01 {
    public static void Question01() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("A"));
        students.add(new Student("B"));
        students.add(new Student("C"));
        students.add(new Student("D"));
        students.add(new Student("E"));
        students.add(new Student("F"));
        students.add(new Student("G"));
        students.add(new Student("D"));
        students.add(new Student("D"));
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
        students.add(0, new Student("Q"));
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + " Name: " + student.getName());
        }

        System.out.println("cau e");
        students.add(new Student("K"));
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + " Name: " + student.getName());
        }

        System.out.println("cau f");
        Collections.reverse(students);
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + " Name: " + student.getName());
        }
        System.out.println("cau j");
        students.removeIf(student -> student.getId()==5 );
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + " Name: " + student.getName());
        }
        System.out.println("cau g");
        Student eighth = findStudentByID(students, 1);
        System.out.println("eighth.getName() = " + eighth.getName());

        System.out.println("cau h");
        Student name = serchName(students, "A");
        if (name != null) {
            System.out.println("Sinh viên có tên '" + name + "' được tìm thấy: ID = " + name.getId());
        } else {
            System.out.println("Không tìm thấy sinh viên có tên " + name + "'");
        }
        System.out.println("cau i");
        DanhsachStudentTrungTen(students);

    }

    public static Student findStudentByID(ArrayList<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) ;
            return student;
        }
        return null;

    }

    public static Student serchName(ArrayList<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public static void DanhsachStudentTrungTen(ArrayList<Student> students) {
        Map<String, Integer> nameCount = new HashMap<>();
        for (Student student : students) {
            String name = student.getName();
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }
        System.out.println("Students with duplicate names:");
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Name: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }
    }
    public static void showStudentSameName(List<Student> students){
        List<Student> list1 = new LinkedList<>();
        List<Student> list2 = new LinkedList<>();
        for (Student student : students) {
            String name = student.getName();
            if(list1.contains(student)){
              if(!list2.contains(student)){
                  list2.add(student);
              }
            }else {
                list1.add(student);
            }
        }
        System.out.println(list2);
    }
}
