package edu.citytech.javareview.datastructure.sort;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.learning.datastructure.java17.array.ArrayUtilityHelper;

public class T2_SortTest {


    static Integer[] data = {10, 2, 9, 5, 4, 1, 3, 7, 8, 6, 0};
    ArrayUtilityHelper<Integer> helper = ArrayUtilityHelper.instanceOf();

    //Developer: Abdallah Salem
    @BeforeAll static void _beforeAll(){
        int count = SortLogic.sort(data);
        System.out.println("operation count: " + count); 

    }

    @Test
    void t1(){
        
        System.out.println(helper.toString(data));
        
        
        int expected = 10;
        int actual = data[data.length -1]; 
        assertEquals(expected, actual);
    }

    @Test
    void t2(){
        int expected = 0;
        int actual = data[0]; 
        assertEquals(expected, actual);
    }

    @Test
    void t3(){
        int expected = 1;
        int actual = data[1]; 
        assertEquals(expected, actual);
    }
    
    @Test
    void t4(){
        int expected = 3;
        int actual = data[3]; 
        assertEquals(expected, actual);
    }

    @Test
    void t5(){
        
        Integer[] x = new Integer[50];

        for (int i = 0; i < x.length; i++) {
            x[i] = (int) ((x.length) * Math.random());
        }
        helper.toString(x, System.out::println);
        System.out.println("-".repeat(200));
        SortLogic.sort(x);
        helper.toString(x, System.out::println);

        System.out.println("Developer: Abdallah Salem, im doing this on a plane " + new Date());
    }
}
