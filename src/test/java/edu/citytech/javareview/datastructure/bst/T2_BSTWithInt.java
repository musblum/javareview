package edu.citytech.javareview.datastructure.bst;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class T2_BSTWithInt {

    static BinarySearchTree<Integer> advBst = new BinarySearchTree<>();

    static {
        advBst.add(49,155,103,2,113,444,555,1100,1015);
    }

    @Test
    @DisplayName("BinarySearchTree")
    void t1(){
        System.out.println(advBst);
    }
}
