public class GarbegeCollectorDemo {
    public static void main(String[] args) {
        class Animal{
            private String name;

            public Animal(String name) {
                this.name = name;
            }
        }
        Animal animal = new Animal("Dog");
        animal = null;
        Animal s2 = new Animal("cat");
        System.out.println("s2 = " + s2);
        System.gc();
    }
}
