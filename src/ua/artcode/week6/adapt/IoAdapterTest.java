package ua.artcode.week6.adapt;

import java.io.*;

/**
 * Created by admin on 09.12.2014.
 */
public class IoAdapterTest {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("f:/new.txt");
        InputStreamReader adapter = new InputStreamReader(fis);
        BufferedReader bufferedReader = new BufferedReader(adapter);

        String line = null;
        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
    }

}
