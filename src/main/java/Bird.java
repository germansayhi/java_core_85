public class Bird extends Animals implements Flyable, Runnable {
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
        System.out.println("bird can run...");

    }
}
