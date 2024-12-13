package edu.citytech.javareview.datastructure;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

import edu.learning.datastructure.java17.array.ArrayUtilityHelper;
import edu.learning.datastructure.java17.custom.model.KeyAndValue;
import edu.learning.datastructure.java17.facade.AbstractList;

public class DynamicArray<T extends Comparable<T>> extends AbstractList<T> {

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
        return this.getClass().getSimpleName() + " allocated size: " + items.length + " "
                + util.toString(super.items, size());
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
    public Optional<T> removeLast() {
        T t = items[size() - 1];
        super.decrementSize();
        return Optional.of(t);
    }

    @Override
    public Optional<T> getLastItem() {

        Optional<T> optional = Optional.empty();
        if (size() > 0)
            optional = optional.of(items[size() - 1]);
        return optional;
    }

    @Override
    public int removeAll() {
        super.index = 0;
        super.resetSize();
        super.items = this.intFunction.apply(5);

        return 0;
    }

    @Override
    public Optional<T> removeAt(int index) {
        Optional<T> option = Optional.empty();

        if (index > size() || index < 0)
            return option;

        int length = super.size();
        var deletedValue = Optional.of(items[index]);

        for (int i = index; i < length; i++) {
            items[i] = items[i + 1];
        }
        decrementSize();
        return deletedValue;

    }

    // @SuppressWarnings("unchecked")
    // @Override
    // public int filterScore(T value, Consumer<T> consumer) {
    // for (int i = 0; i < super.size(); i++) {
    // if(value instanceof Comparable comparable){
    // int status = comparable.compareTo(items[i]);
    // if(status == 0)
    // consumer.accept(items[i]);
    // }

    // }
    // return super.size();
    // }

    @SuppressWarnings("unchecked")
    @Override
    public int where(T value, Consumer<KeyAndValue<Integer, T>> consumer) {
        for (int i = 0; i < super.size(); i++) {
            if (value instanceof Comparable comparable) {
                int status = comparable.compareTo(items[i]);
                if (status == 0) {
                    var keyAndValue = new KeyAndValue<>(i, items[i]);
                    consumer.accept(keyAndValue);
                }
            }

        }
        return super.size();
    }

    @Override
    public void forEach(Consumer<T> consumer) {
        for (int i = 0; i < items.length; i++) {
            consumer.accept(items[i]);
        }
    }

    @Override
    public boolean remove(T data) {

        DynamicArray<Integer> daOfIndexes = new DynamicArray<>(Integer[]::new);

        this.where(data, keyAndValue -> {
            daOfIndexes.add(keyAndValue.getKey());
        });

        int size = daOfIndexes.size(), deleteCount = 0;
        for (int i = size - 1; i >= 0; i--) {
            var dataIndex = daOfIndexes.get(i).get();
            this.removeAt(dataIndex);
            deleteCount++;

        }
        return deleteCount > 0;
    }

    @Override
    public Optional<T> findFirst(T value) {

        for (int i = 0; i < size(); i++) {
            boolean isFound = value.compareTo(items[i]) == 0;
            if (isFound) {
                return Optional.of(items[i]);
            }
        }
        return Optional.empty();

    }
//    @Override
//    public Optional<T> findFirst(T value) {
//
//        for (int i = 0; i < size(); i++) {
//           if(value == super.items[i]){
//            return Optional.of(items[i]);
//           }
//        }
//       return Optional.empty();
//
//    }



    

}
