package edu.citytech.javareview.datastructure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.learning.datastructure.java17.array.ArrayUtilityHelper;

public class T1_Array {

    ArrayUtilityHelper<Integer> ah  = ArrayUtilityHelper.instanceOf();

    @Test
    @DisplayName("Test for a simple array")
    void t1(){
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(ah.toString(numbers));
        numbers = new Integer[8];
        numbers[7] = 8;
        System.out.println(ah.toString(numbers));
        System.out.println("Developer: Abdallah, Salem, Date: " + new java.util.Date());


    }

}
