package edu.citytech.javareview.datastructure;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

import edu.learning.datastructure.java17.array.ArrayUtilityHelper;
import edu.learning.datastructure.java17.facade.AbstractList;

public class DynamicArray<T> extends AbstractList<T> {

    private static ArrayUtilityHelper<?> util = ArrayUtilityHelper.instanceOf();

    public DynamicArray(IntFunction<T[]> intFunction) {
        super.intFunction = intFunction;
        super.items = intFunction.apply(super.allocatedSize);
    }

    public DynamicArray(IntFunction<T[]> intFunction, int allocatedSize) {
        this.allocatedSize = allocatedSize;
        super.intFunction = intFunction;
        super.items = intFunction.apply(super.allocatedSize);
    }

    @Override
    public boolean add(T item) {
        incrementSize();

        if (super.allocatedSize == size()) {
            super.allocatedSize = super.allocatedSize * 2;
            T[] newItems = intFunction.apply(super.allocatedSize);

            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }

            super.items = newItems;
        }

        items[index++] = item;
        return true;
    }

    @Override
    public String toString() {
        return "DynamicArray allocated size: " + items.length + " " + util.toString(super.items, size());
    }

    @Override
    public Optional<T> get(int index) {
        T value = super.items[index];
        var optional = Optional.of(value);
        return optional;
    }

    @Override
    public void filter(Predicate<T> predicate, Consumer<T> consumer) {

        boolean status = false;
        for (int i = 0; i < size(); i++) {
            status = predicate.test(items[i]);
            if (status) {
                consumer.accept(super.items[i]);    
            }

        }

    }

    @Override
    public T removeLast(){
        T t = items[size() - 1];
        super.decrementSize();
        return t;
    }

    @Override
    public Optional<T> getLastItem() {
        
        Optional<T> optional = Optional.empty();
        if(size() > 0)
            optional = optional.of(items[size() - 1]);
        return optional;
    }

    @Override
    public void removeAll() {
        super.index = 0;
        super.resetSize();
        super.items = this.intFunction.apply(5);
    }

    @Override
    public T removeAt(int index) {
        T t = super.items[index] = null;
        super.decrementSize(); 
        for(int i = index +1; i < size(); i++){
            super.items[i - 1] = super.items[i];
            super.items[i] = null;
        }
        return t;
        
    }

    
    
    
}
