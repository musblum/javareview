package edu.citytech.javareview.datastructure.bst;

import java.util.function.Consumer;

public class BSTOrder {

    public static <T extends Comparable<T>> void inOrder(BSTNode<T> node, Consumer<T> consumer) {

        if (node == null)
            return;

        inOrder(node.left, consumer);
        consumer.accept(node.getValue());
        inOrder(node.right, consumer);

    }
}
