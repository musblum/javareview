package edu.citytech.javareview.datastructure.avl;

public class AVLHelper {

    static <T extends Comparable<T>> boolean isLessThan(T value1, T value2) {
        return value1.compareTo(value2) < 0;
    }

    static <T extends Comparable<T>> boolean isGreaterThan(T value1, T value2) {
        return value1.compareTo(value2) > 0;
    }

    static <T extends Comparable<T>> boolean isEqualTo(T value1, T value2) {
        return value1.compareTo(value2) == 0;
    }

    // A utility function to get the
    // height of the tree
    static <T extends Comparable<T>> int height(AVLNode<T> node) {
        if (node == null)
            return 0;
        return node.height;
    }

    // A utility function to right rotate
    // subtree rooted with y
    static <T extends Comparable<T>> AVLNode<T> rightRotate(AVLNode<T> node) {
        AVLNode<T> newRoot = node.left;
        AVLNode<T> T2 = newRoot.right;

        // Perform rotation
        newRoot.right = node;
        node.left = T2;

        // Update heights
        node.height = 1 + Math.max(height(node.left),
                height(node.right));
        newRoot.height = 1 + Math.max(height(newRoot.left),
                height(newRoot.right));

        // Return new root
        return newRoot;
    }

    // A utility function to left rotate
    // subtree rooted with x
    static <T extends Comparable<T>> AVLNode<T>leftRotate(AVLNode<T> node) {
        AVLNode<T> newRoot = node.right;
        AVLNode<T> T2 = newRoot.left;

        // Perform rotation
        newRoot.left = node;
        node.right = T2;

        // Update heights
        node.height = 1 + Math.max(height(node.left),
                height(node.right));
        newRoot.height = 1 + Math.max(height(newRoot.left),
                height(newRoot.right));

        // Return new root
        return newRoot;
    }

    // Get balance factor of node N
    static <T extends Comparable<T>> int getBalance(AVLNode<T> node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.right);
    }
}
