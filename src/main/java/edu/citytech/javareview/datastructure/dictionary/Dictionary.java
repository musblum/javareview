package edu.citytech.javareview.datastructure.dictionary;

import java.util.Optional;
import java.util.function.BiConsumer;

import edu.learning.datastructure.java17.facade.AbstractDataType;
import edu.learning.datastructure.java17.facade.IDictionary;
import edu.learning.datastructure.java17.facade.IModelEntry;

public class Dictionary<K extends Comparable<K>, V> implements IDictionary <K, V> {

    private int capacity = 15;
    private final Bucket<K,V>[] buckets;

    private int size;
    private BiConsumer<Integer, IModelEntry<K,V>> biConsumer = (k,v) -> {};

    @SuppressWarnings("unchecked")
    public Dictionary(){
        buckets = new Bucket[capacity];
    }
    @SuppressWarnings("unchecked")
    public Dictionary(int capacity){
        this.capacity = capacity;
        buckets = new Bucket[capacity];
    }

    @Override
    public void put(IModelEntry<K, V> value) {
        K key = value.getKey();
        int index = getIndex(key);

        boolean isEmpty = buckets[index] == null;
        if(!isEmpty){
            biConsumer.accept(index,value);
        }

        if(isEmpty){
        buckets[index] = new Bucket<>();
        }

        Entry<K,V> entry = new Entry<>(value.getKey(), value.getValue());
        size += buckets[index].addEntry(entry);

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Optional<V> get(K key) {
        int index = getIndex(key);
        @SuppressWarnings("unchecked")

        AbstractDataType<Entry<K, V>>  entries = buckets[index].getEntries();
        Optional<Entry<K,V>> entryfound  = entries.findFirst(new Entry<>(key));
        V value = entryfound.get().getValue();

        return Optional.of(value);

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
