package edu.citytech.javareview.datastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Adding and Deleting data")
public class T5_DynamicArray {    

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
        
        dynamicArray.removeAt(10);
        int expected = 10;
        int actual = dynamicArray.size(); 
        dynamicArray.toString(System.out::println);
        assertEquals(expected, actual);        
    }

    @Test
    @DisplayName("(1) Test for Simple DynamicArray")
    void t2() {  
        
        dynamicArray.removeAt(0);
        int expected = 10;
        int actual = dynamicArray.size(); 
        dynamicArray.toString(System.out::println);
        assertEquals(expected, actual);       
    }

    @Test
    @DisplayName("(1) Test for Simple DynamicArray")
    void t3() {  
        
        dynamicArray.removeAt(5);
        int expected = 10;
        int actual = dynamicArray.size(); 
        dynamicArray.toString(System.out::println);
        assertEquals(expected, actual);       
    }

    @Test
    @DisplayName("(1) Test for Simple DynamicArray")
    void t4() {  
        
        dynamicArray.add(numbers);
        dynamicArray.toString(System.out::println);
        dynamicArray.removeAt(21);
        int expected = 21;
        int actual = dynamicArray.size(); 
        dynamicArray.toString(System.out::println);
        assertEquals(expected, actual);       
    }

    @Test
    @DisplayName("(1) Test for Simple DynamicArray")
    void t5() {  
        
        dynamicArray.add(numbers);
        dynamicArray.removeAt(21);
        dynamicArray.removeAt(20);
        int expected = 20;
        int actual = dynamicArray.size(); 
        dynamicArray.toString(System.out::println);
        assertEquals(expected, actual);       
    }

    @Test
    @DisplayName("(1) Test for Simple DynamicArray")
    void t6() {  
        
        dynamicArray.add(numbers);
        dynamicArray.removeAt(0);
        dynamicArray.removeAt(1);
        dynamicArray.removeAt(20);
        int expected = 19;
        int actual = dynamicArray.size(); 
        dynamicArray.toString(System.out::println);
        assertEquals(expected, actual);       
    }

    @Test
    @DisplayName("(1) Test for Simple DynamicArray")
    void t7() {  
        dynamicArray.removeAll();
        dynamicArray.removeAt(0);
        int expected = 0;
        int actual = dynamicArray.size(); 
        dynamicArray.toString(System.out::println);
        assertEquals(expected, actual);       

    }

    @Test
    @DisplayName("(1) Test for Simple DynamicArray")
    void t8() {  
        numbers[0] = null;
        dynamicArray.toString(System.out::println);
        dynamicArray.removeAt(0);
        int expected = 10;
        int actual = dynamicArray.size(); 
        dynamicArray.toString(System.out::println);
        assertEquals(expected, actual);       

    }

    @Test
    @DisplayName("(1) Test for Simple DynamicArray")
    void t9() {  
        
        for(int i = 0; i < dynamicArray.size(); i++){
            dynamicArray.removeAt(i);
        }
        


        int expected = 5;
        int actual = dynamicArray.size(); 
        dynamicArray.toString(System.out::println);
        assertEquals(expected, actual);       

    }

    @Test
    @DisplayName("(1) Test for Simple DynamicArray")
    void t10() {  
        
        System.out.println("I ran out of ideas for tests");

    }
}