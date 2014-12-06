package ua.artcode.data_structures.java;

/**
 * Created by admin on 06.12.2014.
 */
public class TestMyQueue {


    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.queue("1");
        myQueue.queue("2");
        myQueue.queue("3");
        myQueue.queue("4");
        myQueue.queue("5");
        System.out.println(myQueue);
    }
}
