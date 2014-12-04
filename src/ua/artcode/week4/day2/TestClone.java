package ua.artcode.week4.day2;

import ua.artcode.DeepSerializeCloner;
import ua.artcode.week1.Motorcycle;

import java.util.Arrays;

/**
 * Created by admin on 02.12.2014.
 */
public class TestClone {

    public static void main(String[] args) throws CloneNotSupportedException{
        System.out.println("Start");
        Cat cat = new Cat(4, "Kiev", 23, new int[]{1,2,3});
        Cat catCloned = cat.clone();
        System.out.println("after clone()");


        String[] mas = {"let","us","go"};
        System.out.println(Arrays.toString(mas));


        String[] cloned = (String[]) DeepSerializeCloner.deepClone(mas);
        System.out.println(Arrays.toString(cloned));
    }
}
