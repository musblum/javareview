package edu.citytech.javareview.datastructure;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntFunction;

import edu.citytech.javareview.datastructure.sort.BinarySearch;
import edu.citytech.javareview.datastructure.sort.SimpleSort;
import edu.learning.datastructure.java17.custom.model.KeyAndValue;

public class SortedDynamicArray<T extends Comparable<T>> extends DynamicArray<T> {

    private SimpleSort<T> simpleSort = new SimpleSort<>();
    private BinarySearch<T> binarySearch = new BinarySearch<>();

    public SortedDynamicArray(IntFunction<T[]> intFunction) {
        super(intFunction);
    }

    @Override
    public boolean add(T item) {
        super.add(item);
        simpleSort.sort(super.size(), items);
        return true;
    }


    @Override
    public int where(T value, Consumer<KeyAndValue<Integer, T>> consumer) {

        int iterationCount = binarySearch.select(items, value, index -> {

            KeyAndValue<Integer, T> kv = new KeyAndValue<Integer,T>(index, items[index]);
            consumer.accept(kv);
             
        });
        

        return iterationCount;
    }


    @Override
    public Optional<T> findFirst(T value) {

        Optional<T> optional = Optional.empty();

        for (int i = 0; i < size(); i++) {
           if(value == super.items[i]){
            return Optional.of(items[i]);
           } 
        }
       return Optional.empty(); 
        
    }
}
