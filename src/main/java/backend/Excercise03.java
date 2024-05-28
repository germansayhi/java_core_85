package backend;

import entity.*;

public class Excercise03 {
    public static void Question01(){
        student01<Integer> s1 = new student01<>(1,"Bui");
        System.out.println("s1 = " + s1);
        student01<Float> s2 = new student01<>(2f,"Duc");
        System.out.println("s2 = " + s2);
        student01<Double> s3 = new student01<>(1.2,"Quang");
        System.out.println("s3 = " + s3);
    }
    public static void Question02(){
        Printer.print("Duc");
        Printer.print(1);
        Printer.print(1.0);

    }
    public static void Question04(){
        Integer[] A1={1,2,3,4,5,6};
        Double[] A2 ={1.2,1.3,1.4};
        Long[] A3 ={4l,5l,6l};
        Float[] A4 ={1.2f,1.4f};
        printArray(A1);
        printArray(A2);
        printArray(A3);
        printArray(A4);
    }
    public static <E> void printArray(E[] array){
        for (E e : array) {
            System.out.println(e+ " ");
        }
        System.out.println();
    }
    public static void Question05(){
        Integer[] salaries={1000,2000,3000,4000};
        Employee s1 = new Employee<>(1,"Duc",salaries);
        System.out.println(s1);
        s1.lastSalaries();

        Float[] salaries2 ={1000f,3000f,200f};
        Employee s2 = new Employee<>(2,"Quang",salaries2);
        System.out.println(s2);
        s2.lastSalaries();

        Double[] salaries3 ={4000d,2000d};
        Employee s3 = new Employee<>(3,"Quoc",salaries3);
        System.out.println(s3);
        s3.lastSalaries();
    }
    public static void Question06(){
        MyMap<Integer, String> s1= new MyMap<>(1,"Duc");
        System.out.println(s1);
        MyMap<Integer, String> s2= new MyMap<>(2,"Quang");
        System.out.println(s2);
        MyMap<Integer, String> s3= new MyMap<>(3,"Dung");
        System.out.println(s3);
        MyMap<Integer, String> s4= new MyMap<>(4,"Huy");
        System.out.println(s4);
    }
    public static void Question07(){
        Phone<String,Integer> phone1 = new Phone<>("Abc@gmail.com",012222222);
        System.out.println(phone1);
        Phone<Integer,Integer> phone2 = new Phone<>(1,222222222);
        System.out.println(phone2);
        Phone<String,Integer> phone3 = new Phone<>("Duc",0372373042);
        System.out.println("phone3.GetPhoneNumber() = " + phone3.GetPhoneNumber());
        System.out.println("phone3.getKey() = " + phone3.getKey());

    }
      public static void Question08(){
        Staff<Integer, String> s1 = new Staff<>(1,"Duc");
          System.out.println(s1);
          System.out.println("s1.GetId() = " + s1.GetId());
          System.out.println("s1.getName() = " + s1.getName());
          Staff<Long, String> s2 = new Staff<>(2L,"Quang");
          System.out.println(s2);

      }
}
