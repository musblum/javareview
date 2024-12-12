package edu.citytech.javareview.datastructure.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.citytech.javareview.datastructure.SortedDynamicArray;

public class T4_DynamicArray {

    static Integer[] numbers = {10,1,2,3,4,5,6,7,11,-4,20};
    static SortedDynamicArray<Integer> dynamicArray = new SortedDynamicArray(Integer[]::new );

    @BeforeEach void beforeEachMethod(){
        System.out.println("beforeEach");
        dynamicArray.add(numbers);
        dynamicArray.toString(System.out::println);
    }

    @Test
    void t1(){

        int expected  = 20;
        int actual = numbers[ numbers.length -1 ];

        assertEquals(expected, actual);
    }

}
