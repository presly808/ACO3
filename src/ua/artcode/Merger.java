package ua.artcode;

import java.util.Arrays;

/**
 * Created by admin on 24.11.2014.
 */
public class Merger {


    public static int[] merge(int[] mas1, int[] mas2) {
        int[] res = new int[mas1.length + mas2.length];

        for (int i = 0, j = 0, k = 0; k < res.length; k++) {
            if (i >= mas1.length) {
                res[k] = mas2[j++];
            } else if (j >= mas2.length) {
                res[k] = mas1[i++];
            } else if(mas1[i] < mas2[j]){
                res[k] = mas1[i++];
            } else {
                res[k] = mas2[j++];
            }
        }

        return res;
    }


    public static void main(String[] args) {
        int[] m1 = {2,45,50,70,67,89};
        int[] m2 = {1,5,7,8,8,89};
        System.out.println(Arrays.toString(merge(m1,m2)));
    }

}
