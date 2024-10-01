package edu.citytech.javareview.datastructure;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Adding and Deleting data")
public class T4_DynamicArray {    

    static Integer[] numbers = {10,1,2,3,4,5,6,7,11,-4,20};  
    static DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new );

    @BeforeEach  void beforeEachMethod() {
        System.out.println("beforeEach");
        dynamicArray.add(numbers);  
        dynamicArray.toString(System.out::println);
    }   

    @Test
    @DisplayName("(1) Test for Simple DynamicArray")
    void t1() {  
        
        int lastNumber = dynamicArray.removeLast();
        int expected = 10;
        int actual = dynamicArray.size(); 
        dynamicArray.toString(System.out::println);
        System.out.println("lastNumber:" +lastNumber);       
        assertEquals(expected, actual);       
    }

    @Test
    @DisplayName("(2) Test for Simple DynamicArray")
    void t2() {      
        dynamicArray.removeLast();
        dynamicArray.removeLast();
        int expected = 11;
        Optional<Integer> actual = dynamicArray.getLastItem();
        dynamicArray.toString(System.out::println);       
        assertEquals(expected, actual.get());         
    }   

    @Test
    @DisplayName("(3) DynamicArray removeAll")
    void t3() {     
        dynamicArray.removeAll();
        int expected = 0;
        int actual = dynamicArray.size();  
        dynamicArray.toString(System.out::println);
        assertEquals(expected, actual);       
    }

    @Test
    @DisplayName("(4) DynamicArray Test")
    void t4() {     
        
        dynamicArray.removeAll();
        dynamicArray.add(215);
        int expected = 215;
        int actual = dynamicArray.get(0).get();
        dynamicArray.toString(System.out::println);
        assertEquals(expected, actual);           
    }
}