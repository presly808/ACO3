package ua.artcode.week3.day2.time_check;

import ua.artcode.algo.InsertionSort;

/**
 * Created by admin on 25.11.2014.
 */
public class InsertionSorter implements TimeAction {

    private int[] mas;

    public InsertionSorter(int[] mas) {
        this.mas = mas;
    }

    @Override
    public void action() {
        InsertionSort.sort(mas);
    }

}
