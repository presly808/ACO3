package ua.artcode.data_structures.java;


public interface IStack {


    /**
     * put element on top of stack
     * @param o element for stack
     */
    void push(Object o);

    /**
     * remove element from top
     * @return element from top
     */
    Object pop();
}
