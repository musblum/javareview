package edu.citytech.javareview.datastructure.dictionary;

import edu.citytech.javareview.datastructure.DynamicArray;
import edu.citytech.javareview.datastructure.SinglyLinkedList;
import edu.citytech.javareview.datastructure.SortedDynamicArray;
import edu.learning.datastructure.java17.facade.AbstractDataType;

public class Bucket <K extends Comparable<K>, V> {

    private AbstractDataType<Entry<K,V>> entries = new SinglyLinkedList<>();
//    private AbstractDataType<Entry<K,V>> entries = new SortedDynamicArray<>(Entry[]::new);

    int addEntry(Entry<K,V> entry) {

        int count = 0;

        var oEntry = this.entries.findFirst(entry);
        if(oEntry.isPresent()) {
            Entry<K,V> entryfound = oEntry.get();
            entryfound.setValue(entry.getValue());
        }
        else {
            entries.add(entry);
            count++;
        }
        return count;
    }

    AbstractDataType<Entry<K, V>> getEntries(){
        return this.entries;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "entries=" + entries +
                '}';
    }
}
