package edu.citytech.javareview.datastructure.dictionary;

import java.util.Optional;
import java.util.function.BiConsumer;

import edu.learning.datastructure.java17.facade.IDictionary;
import edu.learning.datastructure.java17.facade.IModelEntry;

public class Dictionary<K extends Comparable<K>, V> implements IDictionary <K, V> {

    private int capacity = 15;
    private Object[] buckets = null;
    private int size;
    private BiConsumer<Integer, IModelEntry<K,V>> biConsumer = (k,v) -> {};

    public Dictionary(){
        buckets = new Object[capacity];
    }
    public Dictionary(int capacity){
        this.capacity = capacity;
        buckets = new Object[capacity];
    }

    @Override
    public void put(IModelEntry<K, V> value) {
        K key = value.getKey();
        int index = getIndex(key);

        boolean isEmpty = buckets[index] == null;
        if(!isEmpty){
            biConsumer.accept(index,value);
        }

        buckets[index] = value;
        size++;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Optional<V> get(K key) {
        int index = getIndex(key);
        @SuppressWarnings("unchecked")
        V dto = (V)buckets[index];

        if(dto != null)
            return Optional.of(dto);
        else 
            return Optional.empty();

    }

    private int getIndex(K key){
        int hashCode = key.hashCode();
        int index = hashCode % this.capacity;
        return index;
    }

    @Override
    public void debug(BiConsumer<Integer, Object> consumer) {
        for (int i = 0; i < buckets.length; i++) {
            consumer.accept(i, buckets[i]);
        }
    }

    @Override
    public void collisionEvent(BiConsumer<Integer, IModelEntry<K, V>> biConsumer) {
        this.biConsumer = biConsumer;
    }
}
