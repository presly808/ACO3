package ua.artcode.algo;

import java.util.Date;

/**
 * Created by admin on 25.11.2014.
 */
public class BinarySearch {

    public int binarySearch(int[] mas, int key){
        return binarySearch(mas, 0, mas.length - 1, key);
    }

    // O(lon2N)
    private int binarySearch(int[] mas, int start, int end, int key){
        if(start > end){
            return -1; // mas does not contain key
        }

        int mid = start + (end - start) / 2;

        if(key < mas[mid]){
            return binarySearch(mas, start, mid - 1, key); // go left
        } else if(key > mas[mid]){
            return binarySearch(mas, mid + 1, end, key);// go right
        } else {
            return mid; // if we found element in array
        }
    }

    public static void main(String[] args) {
        int key = 5;
        int[] mas = {1,2,3,4,5,6,7,8,9,10};
        int res = new BinarySearch().binarySearch(mas, key);
        System.out.printf("key %d has index %d", key, res);

    }


}
