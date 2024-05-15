public class Pet {
    protected String name;
    private int age;

    public Pet(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run(){
        System.out.println("Pet is running....");

    }
}
