public class Bird extends Animals implements Flyable, java.lang.Runnable {
    @Override
    public void makeSound() {
        System.out.println("chip");
    }

    @Override
    public void fly() {
        System.out.println("bird flying...");
    }

    @Override
    public void run() {

    }
}
