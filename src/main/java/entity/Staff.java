package entity;

public class Staff <K,V>extends MyMap<K,V>{
    public Staff(K key, V value) {
        super(key, value);
    }
    public K GetId (){
        return super.getKey();
    }
    public V getName (){
        return super.getValue();
    }
}
