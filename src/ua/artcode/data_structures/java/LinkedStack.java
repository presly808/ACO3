package ua.artcode.data_structures.java;

import ua.artcode.dynamic_ds.Node;

import java.util.Iterator;

/**
 *
 */
public class LinkedStack implements IStack {

    private Node top;//null

    @Override
    public void push(Object o) {
        if (top == null) {
            top = new Node(o, null);
        } else {
            Node newNode = new Node(o, top);
            top = newNode;
        }
        //refactored top = new Node(o, top);
    }

    @Override
    public Object pop() {
        if (top == null) {
            return null;
        } else {
            Object ret = top.getValue();
            top = top.getNext();
            return ret;
        }
    }


    @Override
    public Iterator iterator() {
        return null;
    }
}
