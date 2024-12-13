package edu.citytech.javareview.datastructure.dictionary;

import edu.learning.datastructure.java17.facade.IModelEntry;

public class Entry <K extends Comparable<K>, V> implements IModelEntry<K, V>, Comparable<Entry<K, V>> {

    private final K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Entry(K key){
        this.key = key;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    @Override
    public IModelEntry<K, V> setKey(K key) {
        return IModelEntry.super.setKey(key);
    }

    @Override
    public String tostring() {
        return IModelEntry.super.tostring();
    }

    @Override
    public int compareTo(Entry<K, V> o) {
        return this.key.compareTo(o.key);
    }

    @Override
    public String toString() {
        return value + "";
    }

    public void setValue(V value) {
        this.value = value;
    }
}
