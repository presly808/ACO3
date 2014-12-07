package ua.artcode.data_structures.java;

import java.util.Stack;

public class TestStack {

    public static void main(String[] args) {
        IStack as = new LinkedStack();
        as.push("A");
        as.push("B");
        as.push("C");
        as.push("D");
        as.push("E");

        System.out.println(as);

        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());


    }

    public static void doStack(IStack as){

    }
}
