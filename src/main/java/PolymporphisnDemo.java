public class PolymporphisnDemo {
    public static void main(String[] args) {
        /* Tinh da hinh
        * */
        Runnable cat = new Cat();
        callRun(cat);
        Runnable dog =new Bird();
        callRun(dog);
        // instanceOf
    }
    static void callRun(Runnable runnable) {
        if (runnable instanceof Cat) {
            System.out.println("Meo co chay duoc khong");
        } else if (runnable instanceof Dog) {
            System.out.println("Dog co chay duoc khong");
        }
        runnable.run();
    }
}
