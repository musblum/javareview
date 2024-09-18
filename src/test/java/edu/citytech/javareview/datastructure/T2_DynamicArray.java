package edu.citytech.javareview.datastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class  T2_DynamicArray {

    @Test
    @DisplayName("Test for a simple array")
    void t1(){
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};
        
        var  da = new DynamicArray<>(Integer[]::new);

        da.add(numbers[0]);
        da.add(numbers[1]);
        da.add(numbers[2]);
        da.add(numbers[3]);
        da.add(numbers[4]);
        da.add(numbers[5]);
        da.add(numbers[6]);

        int expected = 7;
        int actual = da.size();

        System.out.println(da);
        System.out.println("Abdallah, Salem date: " + new java.util.Date());
        assertEquals(expected, actual);
    }
}
