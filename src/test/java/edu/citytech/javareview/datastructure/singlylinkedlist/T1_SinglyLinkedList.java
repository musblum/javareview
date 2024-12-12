package edu.citytech.javareview.datastructure.singlylinkedlist;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.citytech.javareview.datastructure.SinglyLinkedList;

public class T1_SinglyLinkedList {

    static SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
    static Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};

    @BeforeAll public static void first(){

        singlyLinkedList.add(numbers);

    }

    @Test
    @DisplayName("Test 1 for size")
    void t1(){

        int actual = singlyLinkedList.size(); 
        int expected = 7;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Test get first item")
    void t2(){

        Optional<Integer> actual = singlyLinkedList.get(0); 
        int expected = 1;

        assertEquals(expected, actual.get());

    }

    @Test
    @DisplayName("Test get last item")
    void t3(){

        Optional<Integer> actual = singlyLinkedList.get(6); 
        int expected = 7;

        assertEquals(expected, actual.get());

    }

    @Test
    @DisplayName("Test get next to last item")
    void t4(){

        Optional<Integer> actual = singlyLinkedList.get(2); 
        int expected = 3;
        assertEquals(expected, actual.get());

    }

    @Test
    @DisplayName("Test get next to last item")
    void t5(){

        Optional<Integer> actual = singlyLinkedList.get(5); 
        int expected = 6;
        assertEquals(expected, actual.get());

    }

    @Test
    @DisplayName("Test get next to last item")
    void t6(){

        double actual = singlyLinkedList.sum();
        double expected = 28;
        assertEquals(expected, actual);

    }
}
