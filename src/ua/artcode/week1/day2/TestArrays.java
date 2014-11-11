package ua.artcode.week1.day2;

import java.util.Arrays;

/**
 * Created by admin on 11.11.2014.
 */
public class TestArrays {

    public static void main(String[] args) {
        int[] origin = {5,2,6,98,23,1,-56,3};

        int[] copiedOrig = Arrays.copyOf(origin, 3);
        System.out.println(Arrays.toString(copiedOrig));

        int[] rangeCopied = Arrays.copyOfRange(origin,2,5);
        System.out.println(Arrays.toString(rangeCopied));

        Arrays.sort(origin);

        System.out.println(Arrays.toString(origin));

        /**
         * @see java.lang.System.arraycopy()
         * */
        /*byte[] arr = {1,2,3};
        byte val = 3;
        Arrays.fill(arr, (byte)3);*/

    }
}
