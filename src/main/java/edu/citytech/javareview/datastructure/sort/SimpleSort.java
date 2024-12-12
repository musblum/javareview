package edu.citytech.javareview.datastructure.sort;

import edu.learning.datastructure.java17.sort.AbstractSort;
import edu.learning.datastructure.java17.sort.OperationStats;

public class SimpleSort<T extends  Comparable<T>> extends AbstractSort<T>{

    @Override
    public OperationStats sort(@SuppressWarnings("unchecked") T... data) {
        
        return this.sort(data.length, data);
    }

    
    public OperationStats sort(int actualSize, @SuppressWarnings("unchecked") T... data) {
        if(actualSize ==1)
            return new OperationStats(1, 1, 0);

        int size = (int)Math.pow(actualSize, 2);
        int n = 0;

        for (int i = 0; i < size; i++) {
            swap(data,n);
            n++;

            T nextValue = data[n + 1];

            if(nextValue == null || (n+1) >= data.length)
                n =0;
        }
        return null;
    }

}
