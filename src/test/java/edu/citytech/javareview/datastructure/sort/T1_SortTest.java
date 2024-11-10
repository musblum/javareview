package edu.citytech.javareview.datastructure.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.learning.datastructure.java17.array.ArrayUtilityHelper;

public class T1_SortTest {


    static Integer[] data = {5, 4, 1, 3};
    ArrayUtilityHelper<Integer> helper = ArrayUtilityHelper.instanceOf();

    //Developer: Abdallah Salem
    @BeforeAll static void _beforeAll(){
                SortLogic.sort(data);

    }

    @Test
    void t1(){
        
        System.out.println(helper.toString(data));
        
        
        int expected = 5;
        int actual = data[data.length -1]; 
        assertEquals(expected, actual);
    }

    @Test
    void t2(){
        int expected = 1;
        int actual = data[0]; 
        assertEquals(expected, actual);
    }

    @Test
    void t3(){
        int expected = 3;
        int actual = data[1]; 
        assertEquals(expected, actual);
    }
    
    @Test
    void t4(){
        int expected = 4;
        int actual = data[2]; 
        assertEquals(expected, actual);
    }
}
