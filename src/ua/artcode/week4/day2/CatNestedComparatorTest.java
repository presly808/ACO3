package ua.artcode.week4.day2;

import ua.artcode.data_structures.java.ArrayStack;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 */
public class CatNestedComparatorTest {


    public static void main(String[] args) {
        Cat[] cats = new Cat[10];
        final int g = 7;

        class LocalClass {
            int a = g;
            int b;
        }

        LocalClass localClass = new LocalClass();
        localClass.a = 78;

        Cat cat = new Cat();

       Cat.CatAgeComparator comp = new Cat.CatAgeComparator();

        Cat.OldWoman oldWoman = cat.new OldWoman();

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };



        Arrays.sort(cats, comparator);




    }
}
