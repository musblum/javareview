package edu.citytech.javareview.datastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class  T3_DynamicArray {

    static Integer[] numbers = {10, 1, 2, 3, 4, 5, 6, 7, 11, -4, 20};
    static DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);


    @BeforeAll static void beforeAll(){
        da.add(numbers);
        da.add(numbers);
        da.add(numbers);
        da.add(numbers);
        da.add(numbers);
        da.add(numbers);
        da.add(numbers);
        da.add(8);
    }

    @Test
    @DisplayName("Test for a simple array")
    void t1(){

        int expected =78;
        int actual = da.size();

        System.out.println(da);
        System.out.println("size: " + da.size());
        System.out.println("Abdallah, Salem date: " + new java.util.Date());
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test for a simple array")
    void t2(){
        var actual = da.get(0);
        int expected = 10;
        assertEquals(expected, actual.get());
    }

    @Test
    @DisplayName("Test for a simple array")
    void t3(){
        var dynamicArray = new DynamicArray<>(Integer[]::new);

        da.filter(e -> e  == 10, dynamicArray::add);

        int actual = dynamicArray.size();
        int expected = 7;
        assertEquals(expected, actual);

        dynamicArray.toString(System.out::println);
        System.out.println("Abdallah, salem " + new java.util.Date());
    }
}
