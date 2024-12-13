package edu.citytech.javareview.datastructure.bst;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T1_BST {

    record MyNumber(int number, String description) implements Comparable<MyNumber> {
        @Override
        public int compareTo(MyNumber o) {
            return this.number - o.number;
        }
    }

    BinarySearchTree<MyNumber> advBst = new BinarySearchTree<>();

    MyNumber[] numbers = {
            new MyNumber(800, "eight-hundred"),
            new MyNumber(1, "one"),
            new MyNumber(400, "four-hundred"),
            new MyNumber(200, "two-hundred"),
            new MyNumber(750, "seven-hundred-and-fifty"),
            new MyNumber(950, "nine-hundred-and-fifty"),
            new MyNumber(1200, "twelve-hundred"),
            new MyNumber(875, "eight-hundred-and-seventy-five"),
            new MyNumber(1, "uno"),
    };

    @Test
    @DisplayName("BinarySearchTree")
    void t2(){

        advBst.add(numbers);
        System.out.println(advBst);
        var o = advBst.findFirst(new MyNumber(1, ""));
        String expected = "uno", actual = o.get().description();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("BinarySearchTree")
    void t3(){
        advBst.add(numbers);
        var max = advBst.getFirstItem();
        System.out.println(advBst);
        var actual = max.orElse(new MyNumber(0, "")).number();
        var expected = 1200;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("BinarySearchTree")
    void t4(){
        advBst.add(numbers);
        var max = advBst.getLastItem();
         System.out.println(advBst);
        var actual = max.orElse(new MyNumber(0, "")).number();
        var expected = 200;
        assertEquals(expected, actual);
    }

    @Test
    void t5(){
        System.out.println(advBst);
    }
}



