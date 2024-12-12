package edu.citytech.javareview.datastructure.singlylinkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import edu.citytech.javareview.datastructure.SinglyLinkedList;

public class T3_SinglyLinkedList_Delete {

    private SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
    private final String[] letters = { "r", "d", "a", "c", "f", "g", "z", "t", "s" };

    @BeforeEach
    public void first() {
        singlyLinkedList = new SinglyLinkedList<>();
       
        System.out.println(singlyLinkedList);
    }

    @Test
    @DisplayName("Check size")
    void t1() {
        int actual = singlyLinkedList.size();
        int expected = 9;
        
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Remove 1st")
    void t2Remove1st() {       
        int actual = singlyLinkedList.size();
        int expected = 9;        
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Remove 2nd")
    void t2Remove2nd() {       
        int actual = singlyLinkedList.size();
        int expected = 9;        
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Remove Last")
    void t3RemoveLast() {        
        int actual = singlyLinkedList.size();
        int expected = 9;        
        assertEquals(expected, actual);
    }
}