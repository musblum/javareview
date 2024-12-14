package edu.citytech.javareview.datastructure.avl;

import edu.citytech.javareview.datastructure.bst.BSTOrder;
import edu.learning.datastructure.java17.facade.AbstractDataType;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import static edu.citytech.javareview.datastructure.avl.AVLHelper.*;
public class AVLTree<T extends Comparable<T>> extends AbstractDataType<T> {


    private AVLNode<T> root;

    private int size = 0;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean add(T item) {
        this.root = insert(root, item);
        size++;
        return true;
    }

    // Recursive function to insert a key in
    // the subtree rooted with node
    private AVLNode<T> insert(AVLNode<T> node, T key) {

        // Perform the normal BST insertion
        if (node == null)
            return new AVLNode<T>(key);


        //key < node.key
        if (isLessThan(key, node.key))
            node.left = insert(node.left, key);
        //key > node.key
        else if (isGreaterThan(key, node.key))
            node.right = insert(node.right, key);
        else // Equal keys are not allowed in BST
            return node;

        // Update height of this ancestor node
        node.height = 1 + Math.max(height(node.left),
                height(node.right));

        // Get the balance factor of this ancestor node
        int balance = getBalance(node);

        // If this node becomes unbalanced,
        // then there are 4 cases

        // Left Left Case
        if (balance > 1 && isLessThan(key, node.left.key)) //key < node.left.key
            return rightRotate(node);

        // Right, Right Case
        if (balance < -1 && isGreaterThan(key, node.right.key)) //key > node.right.key
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && isGreaterThan(key, node.left.key)) //key > node.left.key
            {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && isLessThan(key, node.right.key) ) //key < node.right.key
        {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        // Return the (unchanged) node pointer
        return node;
    }

    @Override
    public Optional<T> findFirst(T value) {
        T x = findFirst(root, value);
        return x == null ? Optional.empty() : Optional.of(x);
    }

    private T findFirst(AVLNode<T> node, T item) {

        if(node == null)
            return null;

        T value = node.key;
        boolean isEqual = item.compareTo(value) == 0;

        if(isEqual)
            return node.key;
        else{
            boolean isLessThan = item.compareTo(value) < 0;
            if(isLessThan)
                value = findFirst(node.left, item);
            else
                value = findFirst(node.right, item);
        }

        return value;
    }

    @Override
    public String toString() {


        StringBuilder sb = new StringBuilder();
        AtomicInteger ai = new AtomicInteger(0);

        sb.append(getClass().getSimpleName());
        sb.append(" size: ").append(size).append(" data [");

        AVLHelper.preOrder(root, e ->{
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
