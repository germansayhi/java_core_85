public class Dog extends Pet {
    public Dog(int age, String name) {
        super(age, name);
    }
    @Override
    public void run() {
        System.out.println(this.getName()+" is running...");
    }
}
