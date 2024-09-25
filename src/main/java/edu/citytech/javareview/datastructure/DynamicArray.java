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
        return false;
    }

    @Override
    public String toString() {
        return "DynamicArray" + util.toString(super.items, size());
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
}
