package ua.artcode.week3.day1.comp;

import java.util.Comparator;

public class DogNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Dog d1 = (Dog) o1;
        Dog d2 = (Dog) o2;

        return d1.getCallName().compareTo(d2.getCallName());
    }
}
