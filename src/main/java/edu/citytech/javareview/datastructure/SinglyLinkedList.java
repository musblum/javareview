package edu.citytech.javareview.datastructure;

import java.util.Optional;
import java.util.function.Consumer;

import org.apache.poi.ss.formula.functions.T;

import edu.learning.datastructure.java17.custom.model.KeyAndValue;
import edu.learning.datastructure.java17.facade.AbstractLinkedList;
import edu.learning.datastructure.java17.facade.AbstractNode;

public class SinglyLinkedList<T extends Comparable<T>> extends AbstractLinkedList<T> {

    private AbstractNode<T> first;
    private AbstractNode<T> last;

    @Override
    public boolean add(T item) {
        incrementSize();

        var node = new Node<T>(item);

        if (AbstractNode.isEmpty(first))
            first = last = node;
        else {
            last.setNext(node);
            last = node;
        }

        return true;
    }

    @Override
    public Optional<T> getFirstItem() {

        Optional<T> current = Optional.empty();

        if (size() > 0) {
            var value = this.first.getValue();
            current = Optional.of(value);
        }

        return current;
    }

    @Override
    public Optional<T> getLastItem() {

        Optional<T> current = Optional.empty();

        if (size() > 0) {
            var value = this.last.getValue();
            current = Optional.of(value);
        }

        return current;
    }

    @Override
    public Optional<T> get(int index) {
        int size = super.size();
        Optional<T> current = Optional.empty();

        if (index == 0 && size >= 0) {
            current = getFirstItem();
        } else if (index == size - 1) {
            current = getLastItem();
        } else
            current = getAt(index);

        return current;
    }

    @Override
    public Optional<T> removeFirst() {

        Optional<T> optional = Optional.empty();

        if (size() == 0)
            return Optional.empty();
        else
            optional = Optional.of(first.getValue());

        AbstractNode<T> secondNode = first.getNext();
        first.setNext(null);
        first = null;
        first = secondNode;

        decrementSize();
        return optional;
    }

    private AbstractNode<T> getNodeAt(int index) {

        AbstractNode<T> firstNode = this.first;
        AbstractNode<T> currentNode = firstNode;

        int currentIndex = 0;

        while (currentNode != null) {
            if (currentIndex == index)
                break;

            currentIndex++;
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    private Optional<T> getAt(int index) {
        Optional<T> current = Optional.empty();
        AbstractNode<T> firstNode = this.first;
        AbstractNode<T> currentNode = firstNode;

        int currentIndex = 0;

        while (currentNode != null) {
            if (currentIndex == index)
                break;

            currentIndex++;
            currentNode = currentNode.getNext();
        }

        T value = currentNode.getValue();
        current = Optional.of(value);
        return current;

    }

    @Override
    public double sum() {
        double sum = 0.0; // Initialize the sum as a double.

        AbstractNode<T> currentNode = this.first; // Start from the first node.

        // Traverse the list.
        while (currentNode != null) {
            // Convert the node's value to a double and add it to the sum.
            sum += ((Number) currentNode.getValue()).doubleValue();
            currentNode = currentNode.getNext();
        }

        return sum; // Return the total sum.
    }

    @Override
    protected AbstractNode<T> getFirstNode() {
        return this.first;
    }

    public Optional<String> get() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }    


    @Override
    public Optional<T> removeAt(int index) {

        if(size() == 0)
            return Optional.empty();


        if (index == 0)
            return removeFirst();

        decrementSize();

        AbstractNode<T> previousNode = this.getNodeAt(index - 1);
        AbstractNode<T> deleteNode = previousNode.getNext();
        Optional<T> deletedValue = Optional.of(deleteNode.getValue());
        AbstractNode<T> nextNode = deleteNode.getNext();
        
        previousNode.setNext(nextNode);
        deleteNode.setNext(null);
        deleteNode = null;

        return deletedValue;
    }

    @Override
public boolean remove(T data) {
    if (size() == 0 || data == null) {
        return false;
    }

    boolean isRemoved = false;
    AbstractNode<T> currentNode = this.first;
    AbstractNode<T> previousNode = null;

    while (currentNode != null) {
        if (data.compareTo(currentNode.getValue()) == 0) {
            // Remove the matching node
            if (currentNode == first) {
                // Special case: Removing the first node
                removeFirst();
                currentNode = this.first; // Update currentNode to the new first node
            } else {
                // General case: Remove the node
                previousNode.setNext(currentNode.getNext());
                if (currentNode == last) {
                    last = previousNode; // Update `last` if the removed node was the last
                }
                currentNode.setNext(null); // Disconnect the node
                currentNode = previousNode.getNext(); // Move to the next node
                decrementSize();
            }
            isRemoved = true;
        } else {
            // Move to the next node
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
    }

    return isRemoved; // Return true if at least one node was removed
}

    @Override
    public Optional<T> findFirst(T value) {

        AbstractNode<T>  currentNode = this.first;
        int currentIndex = 0; int status;

        while (currentNode != null) {
            status = currentNode.getValue().compareTo(value);
            if(status == 0) 
                break;

            currentIndex++;
            currentNode = currentNode.getNext();
        }
        
        Optional<T> optionalFound = Optional.empty();
        if(currentNode != null){
            T valueFound = currentNode.getValue();
            optionalFound =  Optional.of(valueFound);
        }
        

        return optionalFound;
    }

    
    // Developer: Abdallah, Salem
}
