public class MyMath <K,V>{
    private K key;
    private V value;

    public MyMath(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyMath{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
