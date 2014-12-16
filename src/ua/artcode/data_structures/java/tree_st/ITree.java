package ua.artcode.data_structures.java.tree_st;

/**
 * Created by admin on 16.12.2014.
 */
public interface ITree <E> {

    void add(E el);

    E min();

    E max();

    boolean contains(E el);

    void traversePrint();


}
