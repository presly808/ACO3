package ua.artcode.week2;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

/**
 * Created by admin on 17.11.2014.
 */
public class TestDate {


    public static void main(String[] args) {
        Date date = new Date(); //1970.01.01 - current time
        long millis = date.getTime();
        int compareRes = date.compareTo(new Date(System.currentTimeMillis() + 20));
        System.out.println(compareRes);
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        String formatted = sdf.format(date);
        System.out.println(formatted);


    }
}
