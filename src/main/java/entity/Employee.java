package entity;

import java.util.Arrays;

public class Employee <E extends Number>{
    private int id;
    private String name;
    private E[] salaries;

    public Employee(int id, String name, E[] salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public E[] getSalaries() {
        return salaries;
    }

    public void setSalaries(E[] salaries) {
        this.salaries = salaries;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salaries=" + Arrays.toString(salaries) +
                '}';
    }
    public void lastSalaries(){
        if(salaries != null && salaries.length >0){
            System.out.println("Thang luong cuoi cung la:" +salaries[salaries.length-1]);
        }else {
            System.out.println("Nv nay chua co luong");
        }
    }
}
