package edu.citytech.javareview.datastructure.bst;

import edu.learning.datastructure.java17.facade.AbstractNode;

public class BSTNode<T extends Comparable<T>> extends AbstractNode <T>{

        BSTNode<T> left, right;

    public BSTNode(BSTNode<T> left, BSTNode<T> right, T value) {
        this.left = left;
        this.right = right;
        super.value = value;
    }
}
