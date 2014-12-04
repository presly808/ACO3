package ua.artcode.data_structures.java;

import ua.artcode.dynamic_ds.Node;

import java.util.Iterator;

/**
 *
 */
public class LinkedStackGen<T> implements IStack<T> {

    private StackNode top;//null

    @Override
    public void push(T o) {
        top = new StackNode(o, top);
    }

    @Override
    public T pop() {
        if (top == null) {
            return null;
        } else {
            T ret = top.value;
            top = top.next;
            return ret;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedStackIterator();
    }

    //Innervbn

    private class StackNode {
        private T value;
        private StackNode next;

        private StackNode(T value, StackNode next) {
            this.value = value;
            this.next = next;
        }


    }


    private class LinkedStackIterator implements Iterator<T> {

        StackNode iter = top;

        @Override
        public boolean hasNext() {
            return iter != null;
        }

        @Override
        public T next() {
            T ret = iter.value;
            iter = iter.next;
            return ret;
        }

        @Override
        public void remove() {

        }
    }

}
