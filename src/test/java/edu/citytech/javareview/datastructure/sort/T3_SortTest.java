package edu.citytech.javareview.datastructure.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.learning.datastructure.java17.array.ArrayUtilityHelper;

public class T3_SortTest {

    static SimpleSort<String> simpleSort = new SimpleSort<>();
    static String data[] = {"b", "c", "a", "z", "d", "f", "g", "h" , "x", "y"};
    static ArrayUtilityHelper<String> helper = ArrayUtilityHelper.instanceOf();

    @BeforeAll public static void init(){
        helper.toString(data, System.out::println);
        simpleSort.sort(data); 
    }

    @Test 
    public void T1(){

        String expected = "z";
        String actual = data[data.length - 1];  
        helper.toString(data, System.out::println);

        assertEquals(expected, actual);
       
    }

    @Test public void T2(){
        String expected = "a";
        String actual = data[0];  
        assertEquals(expected, actual);
        
    }

    @Test public void T3(){
        String expected = "b";
        String actual = data[1];  
        assertEquals(expected, actual);
        
    }
}
