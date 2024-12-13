package edu.citytech.javareview.datastructure.avl;// Java program to insert a node in AVL tree

class AVLNode <T extends Comparable<T>> {

    AVLNode<T> left;
    T key;
    AVLNode<T> right;
    int height; 

    AVLNode(T key) {
        this.key = key;
        left = null; 
        right = null; 
        height = 1;
    }

    private String isNull(AVLNode<T> node, String value) {
        return node == null ? value : node.key + "";
    }

    @Override
    public String toString() {
        return "AVLNode{" +
                "left=" + isNull(left, "N/A") +
                ", key=" + key +
                ", right=" + isNull(right, "NA") +
                ", height=" + height +
                '}';
    }
}