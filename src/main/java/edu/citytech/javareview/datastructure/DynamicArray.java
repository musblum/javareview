package edu.citytech.javareview.datastructure;

import java.util.function.IntFunction;

import edu.learning.datastructure.java17.array.ArrayUtilityHelper;
import edu.learning.datastructure.java17.facade.AbstractList;

public class DynamicArray<T> extends AbstractList<T>{
    private static ArrayUtilityHelper<?> util = ArrayUtilityHelper.instanceOf();

    public DynamicArray(IntFunction<T[]> intFunction) {
        super.intFunction = intFunction;        
        super.items = intFunction.apply(allocatedSize);
    }

    @Override
    public boolean add(T item) {
        incrementSize();
        items[index++] = item;
        return false;
    }

    @Override
    public String toString() {
        return "DynamicArray" + util.toString(super.items);
    }

    
    
}
