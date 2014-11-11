package ua.artcode.algo;

/**
 * Created by admin on 11.11.2014.
 */
public class SelectionSort {

    public static void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minI = i;

            //find minI for min element in array
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minI]){
                    minI = j;
                }
            }

          swap(arr, i, minI);

        }

    }

    public static void swap(int[] mas, int a, int b){
        int temp = mas[a];
        mas[a] = mas[b];
        mas[b] = temp;
    }

}
