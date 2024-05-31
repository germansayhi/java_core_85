public class InnerClassDemo {
    public static void main(String[] args) {

        // Class trong class
        Student student = new Student(1, "DUc");
        Student.Gender gender = student.new Gender("Male");
        gender.showInfo();

        // Co the truy cap private cua lop ngoai

        // clas trong method
        demoClassInMethod();
    }
    public static void demoClassInMethod(){
        class Dog{
            private String name;
            private String color;

            public Dog(String name, String color) {
                this.name = name;
                this.color = color;
            }

            @Override
            public String toString() {
                return "Dog{" +
                        "name='" + name + '\'' +
                        ", color='" + color + '\'' +
                        '}';
            }
        }
        Dog dog = new Dog("shiba", "Blue");
        System.out.println("Dog: " +dog);
    }
}
