package ua.artcode.data_structures.java;

import java.util.Arrays;

public class ArrayStack implements IStack {

    private Object[] mas;
    private int top = 0;

    public ArrayStack(){
        mas = new Object[10];
    }

    @Override
    public void push(Object o) {
        if(top < mas.length){
            mas[top++] = o;
        } else {
            System.err.println("Stack is full");
        }
    }

    @Override
    public Object pop() {
        if(top == 0){
            System.err.println("Stack is empty");
            return null;
        }

        return mas[--top];
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(int i = top - 1; i >= 0; i--){
            res.append("|").append(mas[i]).append("|\n");
        }

        return res.toString();
    }
}
