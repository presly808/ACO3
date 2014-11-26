package ua.artcode.algo;

/**
 * Created by admin on 25.11.2014.
 */
public class ArraysUtils {


    public static int[] genMas(int size){
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random() * 1000);
        }
        return mas;
    }

}
