package entity;

public class Salary <E extends Number>{
    private E salary;

    public Salary(E salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salary=" + salary +
                '}';
    }
}
