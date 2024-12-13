package edu.citytech.javareview.datastructure.bst;

import edu.learning.datastructure.java17.array.ArrayUtilityHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class T1_Array {

    BinarySearchTree<Integer> bst = new BinarySearchTree<>();

    @Test
    @DisplayName("BinarySearchTree")
    void t1(){

        Integer[] numbers = {800, 400, 950, 200, 750, 950, 1200, 875};
        bst.add(numbers);

        System.out.println(bst);

    }

}
