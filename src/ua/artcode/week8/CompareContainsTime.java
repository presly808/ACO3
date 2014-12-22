package ua.artcode.week8;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 */
public class CompareContainsTime {

    public static void main(String[] args) {
        ContainsMyComparator containsMyComparator =
                new ContainsMyComparator(new ArrayList(), new HashSet(), 10_000_000);

        containsMyComparator.compare();
    }

}
