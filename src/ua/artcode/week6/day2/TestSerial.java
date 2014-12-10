package ua.artcode.week6.day2;

import ua.artcode.week4.day2.Cat;
import ua.artcode.week6.io.IOUtils;

import java.rmi.NoSuchObjectException;

/**
 *
 */
public class TestSerial {

    public static final String PATH = "f:/cat.data";

    public static void main(String[] args) throws NoSuchObjectException {
        Cat cat = new Cat(2, "Street", 5, new int[]{1,2,3});
        System.out.println(cat);
        //IOUtils.saveObjToFile(cat, PATH);

        Cat cat2 = (Cat) IOUtils.loadObjectFromFile(PATH);
        System.out.println(cat2);



    }


}
