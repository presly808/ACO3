package ua.artcode.data_structures.java;

/**
 * Created by admin on 02.12.2014.
 */
public class LinkedGenTest {

    public static void main(String[] args) {
        IStack<String> stack = new LinkedStackGen<String>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("3");

        for(String s : stack){

        }
    }
}