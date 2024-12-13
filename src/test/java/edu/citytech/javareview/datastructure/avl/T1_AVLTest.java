package edu.citytech.javareview.datastructure.avl;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T1_AVLTest {

    AVLTree<Integer> avlTree;

    @BeforeEach
    void beforeEach(){
        avlTree = new AVLTree<Integer>();
        avlTree.add(10,20,30,40,50,25);
    }

    @Test
    @DisplayName("AVLTree")
    void t1(){
        Optional<Integer> actual = avlTree.findFirst(50);
        Optional<Integer> expected = Optional.of(50);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("AVLTree")
    void t2(){
        Optional<Integer> actual = avlTree.findFirst(10);
        Optional<Integer> expected = Optional.of(10);

        assertEquals(expected, actual);
    }
}
