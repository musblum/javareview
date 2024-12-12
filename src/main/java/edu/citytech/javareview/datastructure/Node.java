package edu.citytech.javareview.datastructure;


import edu.learning.datastructure.java17.facade.AbstractNode;

public class Node<T> extends AbstractNode<T> {

    private Node<T> next = null;

    public Node(T value) {
        super.value = value;
    }
    
    public void setValue(T value){
        super.value = value;
    }

    public AbstractNode<T> getNext() {
        return next;
    }

    @Override
    public void setNext(AbstractNode<T> node) {
        this.next =  (Node<T>)node;
    }

    

    
    
}
