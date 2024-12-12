package edu.citytech.javareview.datastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.learning.datastructure.java17.facade.AbstractDataType;


public class TB_DynamicArrayRemoveAt {

    private AbstractDataType<String> da = null;
    private String[] letters = { "t", "d", "a", "c", "f", "g", "z", "t", "t" };
    private static int i = 0;

    @BeforeEach
    public void beforeEachTest() {
        da = new SinglyLinkedList<>();
        da.add(letters);
        System.out.println("beforeEach: "  + da  );
    }

    @Test public void t1() {

        var actual = da.removeAt(2);
        var expected = "a";

        System.out.println("t1........: " + da);
        assertEquals(expected, actual.get());
    }

    @Test public 
    void t2() {

        da.removeAt(2);
        var expected = 8;
        var actual = da.size();

        System.out.println("t2........: " + da);
        assertEquals(expected, actual);
    }

    @Test public 
    void t3() {

        da.remove("f");
        var expected = 8;
        var actual = da.size();

        System.out.println("t3........: " + da);
        assertEquals(expected, actual);
    }

    @Test public 
    void t4() {

        da.remove("t");
        var expected = 6;
        var actual = da.size();

        System.out.println("t4........: " + da);
        assertEquals(expected, actual);
    }
}