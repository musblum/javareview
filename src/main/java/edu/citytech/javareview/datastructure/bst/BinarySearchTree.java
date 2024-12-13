package edu.citytech.javareview.datastructure.bst;

import edu.learning.datastructure.java17.facade.AbstractDataType;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class BinarySearchTree <T extends Comparable<T>> extends AbstractDataType<T> {

    private int nodeCount = 0;
    private BSTNode<T> root;

    @Override
    public int size(){
        return nodeCount;
    }

    @Override
    public boolean add(T item) {
        this.root = add(root, item);
        nodeCount++;
        return true;
    }

    private BSTNode<T> add(BSTNode<T> node, T item) {

        //The first insert
        if(node == null) {
            node = new BSTNode<>(null, null, item);
        }
        else{
            boolean isLessThan = item.compareTo(node.getValue()) < 0;
            if(isLessThan)
                node.left = add(node.left, item);
            else{
                boolean isEqualTo = item.compareTo(node.getValue()) == 0;
                if (isEqualTo)
                    node.setValue( item);
                else
                   node.right = add(node.right, item);
            }
        }
        return node;

    }

    @Override
    public Optional<T> findFirst(T value) {
        T x = findFirst(root, value);
        return x == null ? Optional.empty() : Optional.of(x);
    }

    private T findFirst(BSTNode<T> node, T item) {

        if(node == null)
            return null;

        T value = node.getValue();
        boolean isEqual = item.compareTo(value) == 0;
        if(isEqual)
            return node.getValue();
        else{
            boolean isLessThan = item.compareTo(value) < 0;
            if(isLessThan)
                value = findFirst(node.left, item);
            else
                value = findFirst(node.right, item);
        }

        return value;
    }

    public Optional<T> getFirstItem() {
        if (this.root == null) {
            return Optional.empty(); // Return empty if the tree is empty
        }
        BSTNode<T> node = this.root;

        // Traverse to the rightmost node
        while (node.right != null) {
            node = node.right;
        }

        return Optional.of(node.getValue()); // Return the value of the rightmost node
    }

    public Optional<T> getLastItem() {
        if (this.root == null) {
            return Optional.empty(); // Return empty if the tree is empty
        }
        BSTNode<T> node = this.root;

        while (node.left != null) {
            node = node.left;
        }

        return Optional.of(node.getValue()); // Return the value of the rightmost node
    }

    @Override
    public String toString() {

        int size = this.size();

        StringBuilder sb = new StringBuilder();
        AtomicInteger ai = new AtomicInteger(0);

        sb.append(getClass().getSimpleName());
        sb.append(" size: ").append(size).append(" data [");

        BSTOrder.inOrder(root, e ->{
            if (ai.get() > 0)
                sb.append(", ");

            sb.append("(");
            sb.append(ai.get());
            sb.append(")->");
            sb.append(e);
            ai.getAndIncrement();
        });

        sb.append("]");

        return sb.toString();
    }
}
