public class Dog implements Comparable<Dog> {
    private int id;
    private String name;


    public Dog(int id,String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int compareTo(Dog that) {
        return Integer.compare(that.id, this.id);
    }
}
