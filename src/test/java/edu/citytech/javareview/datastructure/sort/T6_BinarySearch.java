package edu.citytech.javareview.datastructure.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.citytech.javareview.datastructure.DynamicArray;

public class T6_BinarySearch {

    static final Integer[] items = {2,3,4,10,40,42,44,75,77,100,103,107,110,112};	
    static final Integer[] items2 = {};
    static BinarySearch<Integer> binarySearch;

    @BeforeAll static public void _1st(){
        binarySearch = new BinarySearch<>();

    }

    @Test
    public void t1(){
        int actual = binarySearch.select(items, 100);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    public void t2(){

        var dynamicArray = new DynamicArray<>(Integer[]::new );
        
        int expected = 13; 
        binarySearch.select(items, 112, dynamicArray::add);
        int actual = dynamicArray.get(0).get();
        dynamicArray.toString(System.out::println);
        // assertEquals(expected,actual);

    }

    @Test
    public void t3(){

        var dynamicArray = new DynamicArray<>(Integer[]::new );
        
        int expected = 0; 
        binarySearch.select(items, 2, dynamicArray::add);
        int actual = dynamicArray.get(0).get();
        dynamicArray.toString(System.out::println);
        // assertEquals(expected,actual);

    }

    @Test
    public void t4(){

        var dynamicArray = new DynamicArray<>(Integer[]::new );
        
        int expected = 1; 
        binarySearch.select(items, 77, dynamicArray::add);
        int actual = dynamicArray.get(0).get();
        dynamicArray.toString(System.out::println);
        // assertEquals(expected,actual);
        
    }

    @Test
    public void t5(){

        var dynamicArray = new DynamicArray<>(Integer[]::new );
        
        int expected = 4; 
        binarySearch.select(items, 0, dynamicArray::add);
        int actual = dynamicArray.get(0).get();
        dynamicArray.toString(System.out::println);
        // assertEquals(expected,actual);

    }

    @Test
    public void t6(){

        var dynamicArray = new DynamicArray<>(Integer[]::new );
        
        int expected = 1; 
        binarySearch.select(items, 2, dynamicArray::add);
        binarySearch.select(items, 77, dynamicArray::add);
        int actual = dynamicArray.get(0).get();
        dynamicArray.toString(System.out::println);
        // assertEquals(expected,actual);
    }

    @Test
    public void t7(){

        var dynamicArray = new DynamicArray<>(Integer[]::new );
        
        int expected = 0; 
        binarySearch.select(items2, null, dynamicArray::add);
        int actual = dynamicArray.get(0).get();
        dynamicArray.toString(System.out::println);
        // assertEquals(expected,actual);
    }
}
