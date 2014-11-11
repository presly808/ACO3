package ua.artcode.algo;

import java.util.Arrays;

/**
 * Created by admin on 11.11.2014.
 */
public class TestSelectionSort {

    public static void main(String[] args) {
        //byte[] arr = {56,11,35,63,23};
        int[] mas = {34,12,66,2,67,98,1,9};
        SelectionSort.sort(mas);
        System.out.println(Arrays.toString(mas));
    }
}
