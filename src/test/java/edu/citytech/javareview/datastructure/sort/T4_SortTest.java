package edu.citytech.javareview.datastructure.sort;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.learning.datastructure.java17.array.ArrayUtilityHelper;

public class T4_SortTest {

    static SimpleSort<String> simpleSort = new SimpleSort<>();
    static ArrayUtilityHelper<String> helper = ArrayUtilityHelper.instanceOf();

    @AfterAll public static void afterAll(){
        System.out.println("Abdallah, Salem " + new java.util.Date());
    }

    @Test
    void T1(){

        String data[] = {"v","u","w","k","n","l","p","y","a","h","x","o","q","j","s","e","b","m","z","g","r","c","i","d","f","t"};
    
        helper.toString(data, System.out::println);
        simpleSort.sort(data);
        helper.toString(data, System.out::println);
        System.out.println("-".repeat(110));
        
        String expected = "z";
        String actual = data[data.length - 1];  
        assertEquals(expected, actual);
       
    }

    @Test public void T2(){
        String[] data = {"o","x","z","p","n","s","h","t","w","d","c","l","f","y","r","m","j","i","a","b","g","u","k","e","v","q"};
        helper.toString(data, System.out::println);
        simpleSort.sort(data);
        helper.toString(data, System.out::println);
        System.out.println("-".repeat(110));

        String expected = "a";
        String actual = data[0];  
        assertEquals(expected, actual);
        
    }

    @Test public void T3(){
        String[] data = {"o","i","t","h","p","l","n","g","a","s","q","f","c","z","x","u","y","v","w","r","m","j","e","k","b","d"};
        helper.toString(data, System.out::println);
        simpleSort.sort(data);
        helper.toString(data, System.out::println);
        System.out.println("-".repeat(110));

        String expected = "b";
        String actual = data[1];  
        assertEquals(expected, actual);
        
    }


}

