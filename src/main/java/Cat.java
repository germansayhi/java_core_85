public class Cat extends Animals implements Runnable {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void run() {
        System.out.println("Cat can run...");
    }
}