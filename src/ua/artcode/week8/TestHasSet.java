package ua.artcode.week8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by admin on 22.12.2014.
 */
public class TestHasSet {

    public static void main(String[] args) {
        Human h1 = new Human("Valeriy", 30, 400, 2000, false);
        Human h2 = new Human("Serhii", 25, 300, 2000, false);
        Human h3 = new Human("Serhii", 25, 300, 2000, false);
        Human h4 = new Human("Petro", 25, 1, 2000, false);
        Human h5 = new Human("Oleg", 25, 300, 1222, false);
        Human h6 = new Human("Anatoliy", 25, 300, 7000, false);

        Set<Human> set = new HashSet<>();
        set.add(h1);
        set.add(h2);
        set.add(h3);//
        set.add(h4);//
        set.add(h5);//
        set.add(h6);//

        set.contains(h1); //find

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        set.removeAll(Arrays.asList(h3,h4,h6));

        System.out.println(set.size());




    }

}
