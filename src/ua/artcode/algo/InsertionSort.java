package ua.artcode.algo;

import java.util.Arrays;

/**
 * Created by admin on 18.11.2014.
 */
public class InsertionSort {

    public static void sort(int[] mas){
        for(int i = 1; i < mas.length; i++){
            int j = i;
            while (j > 0 && mas[j] < mas[j-1]){
                int temp = mas[j];
                mas[j] = mas[j-1];
                mas[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] mas = {56,33,2,89,67,2,4,1,0,-98};
        InsertionSort.sort(mas);
        System.out.println(Arrays.toString(mas));
    }

}
