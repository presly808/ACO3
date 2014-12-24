package ua.artcode.week8;

import java.util.*;

/**
 *
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String seq =
                "Kolia Vasia Andrey Kolia and some and some guys";

        Set<String> set = new LinkedHashSet<>();
        Collections.addAll(set, seq.split(" "));

        for(String str : set){
            System.out.print(str + " ");
        }


    }


}
