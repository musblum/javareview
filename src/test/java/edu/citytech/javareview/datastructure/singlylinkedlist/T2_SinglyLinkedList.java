package edu.citytech.javareview.datastructure.singlylinkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.citytech.javareview.datastructure.SinglyLinkedList;

public class T2_SinglyLinkedList {

    private SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    private String[] numbers = { "r", "d", "a", "c", "f", "g", "z", "t", "s" };

    @BeforeEach
    public void first() {
        singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add(numbers);
        System.out.println("beforeEach: " + singlyLinkedList);
    }

    @Test
    @DisplayName("Check size")
    void t1() {

        singlyLinkedList.removeFirst();
        int actual = singlyLinkedList.size();
        int expected = 8;
        System.out.println("t1........: " + singlyLinkedList); 
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Check size")
    void t1b() {

        singlyLinkedList.removeFirst();
        String actual = singlyLinkedList.get(0).get();
        String expected = "d";
        System.out.println("t1b.......: " + singlyLinkedList); 
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Remove element 0")
    void t2Remove1st() {       

        singlyLinkedList.removeAt(0);
        int actual = singlyLinkedList.size();
        int expected = 8;        
        System.out.println("t2Remove1st: " + singlyLinkedList); 
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Remove Last")
    void t3RemoveLast() {        
        singlyLinkedList.removeAt(2);
        int actual = singlyLinkedList.size();
        int expected = 8;        
        System.out.println("t3Remove1st: " + singlyLinkedList); 
        assertEquals(expected, actual);
    }
}