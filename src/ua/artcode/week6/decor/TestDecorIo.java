package ua.artcode.week6.decor;

import java.io.*;

/**
 * Created by admin on 09.12.2014.
 */
public class TestDecorIo {

    public static void main(String[] args) throws IOException {


        FileInputStream fis = new FileInputStream("f:/new.txt");

        DataInputStream dis = new DataInputStream(fis);

        String line = dis.readLine();
        System.out.println(line);



    }


}
