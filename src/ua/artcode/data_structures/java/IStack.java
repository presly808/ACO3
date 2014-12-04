package ua.artcode.data_structures.java;


public interface IStack<T> extends Iterable<T> {


    /**
     * put element on top of stack
     * @param o element for stack
     */
    void push(T o);

    /**
     * remove element from top
     * @return element from top
     */
    T pop();
}
