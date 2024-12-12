package edu.citytech.javareview.datastructure.sort;

import java.util.function.Consumer;

public class BinarySearch <T extends Comparable<T>>{
  
   public boolean isEqual(T value1, T value2){
         boolean status = value1.compareTo(value2) == 0;
        return status;
    }
  
    public boolean isLessThan(T value1, T value2){
        boolean status = value1.compareTo(value2) < 0;
        return status;
    }

    public int select(T items[], T searchFor){
        return this.select(items, searchFor, e -> {}); 
    }

    // Returns index of x if it is present in arr[].
    public int select(T items[], T searchFor, Consumer<Integer> consumer)
    {
        int low = 0, high = items.length - 1, numberofOperations = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (isEqual(items[mid],searchFor)){
                consumer.accept(mid);
                break;
            }
                // return mid;

            // If x greater, ignore left half
            if (isLessThan(items[mid] , searchFor))
                low = mid + 1;

            // If x is smaller, ignore right half
            else
                high = mid - 1;
        
            numberofOperations++;
        }

        // # of operations
        // not present
        return numberofOperations;
    }    
}