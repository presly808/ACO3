package ua.artcode.dynamic_ds;


import java.util.Arrays;

public class NodeUtils {

    public static void print(Node chain){
        while (chain != null){ // exit condition
            System.out.println(chain.getValue()); // action
            chain = chain.getNext(); // step
        }
    }

    public static Object[] toArray(Node chain){
        return null;
    }

    public static Node genChain(int[] mas){
        if(mas.length == 0){
            return null;
        } else {
            Node next = genChain(Arrays.copyOfRange(mas,1, mas.length));
            Node current = new Node(mas[0], next);
            return current;
        }
    }

    public static String toString(Node curr){
        return curr != null ? "[" + curr.getValue() + "]-->" +
                                toString(curr.getNext()) : "null";
    }

    public static Node reverse(Node curr){
        Node next = null;
        Node first = null;

        while(curr != null){
            next = curr.getNext();
            curr.setNext(first);
            first = curr;
            curr = next;
        }

        return first;
    }





}
