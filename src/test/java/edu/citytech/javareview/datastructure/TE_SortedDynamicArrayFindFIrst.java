package edu.citytech.javareview.datastructure;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.learning.datastructure.java17.facade.AbstractDataType;


public class TE_SortedDynamicArrayFindFIrst {

    private AbstractDataType<String> da = new SortedDynamicArray<>(String[]::new);
    private String[] letters = { "t", "d", "a", "c", "f", "g", "z", "t", "t" };
    private static int i = 0;

    @BeforeEach
    public void beforeEachTest() {
        da = new DynamicArray<>(String[]::new);
        da.add(letters);
        System.out.println("beforeEach: "  + da  + (++i));
    }

    @Test public 
    void t1() {

        var actual = da.findFirst("t");
        var expected = "t";

        System.out.println("t1........: " + da);

        assertEquals(expected, actual.get());
    }

    @Test public 
    void t2() {        
        
        var actual = da.findFirst("a");
        var expected = "a";

        System.out.println("t2........: " + da);
        assertEquals(expected, actual.get());
    }

    @Test public 
    void t3() {

        var actual = da.findFirst("x");
     
   
        System.out.println("t3........: " + da);
        assertTrue(actual.isEmpty());
        }

    @Test public
    void t4(){
        System.out.println(da);
    }

   
}



