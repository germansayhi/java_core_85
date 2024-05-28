package entity;

public class Phone <K,V> extends MyMap<K,V>{
    public Phone(K key, V value) {
        super(key, value);
    }
    public V GetPhoneNumber(){
       return super.getValue();

    }
    public K getKey(){
        return super.getKey();
    }
}

