package ua.artcode.week3.day1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by admin on 24.11.2014.
 */
public class TestCalendar {


    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2000,10,12,22,22);
        System.out.printf("Date %tc", calendar.getTime());
        Calendar calendar1 = Calendar.getInstance();
    }

}
