package ua.artcode.data_structures.java;


import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList al = new ArrayList(); // 10
        al.add("A");
        al.add("C");
        al.add("D");
        al.add(0, "B");
        //al.clear();
        System.out.println(al.contains("A"));
        System.out.println(al.get(0));

        System.out.println(al.indexOf("a")); // -1
        System.out.println(al.isEmpty());
        al.set(2, "X");
        System.out.println(al.size());
        al.trimToSize(); // 4


        for(Object s : al){
            System.out.println(s);
        }






    }

}
