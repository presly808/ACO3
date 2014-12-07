package ua.artcode.week5.day2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 */
public class TestParseException {

    public static final String PATTERN = "yyyy/MM/dd";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Input date as %s\n", PATTERN);
        String input = sc.nextLine();
        Date date = null;
        try {
            System.out.println("In try");
            date = parse(input);
            System.out.println("after parse");

        } catch (Throwable e){
            System.out.println("In catch block");
            e.printStackTrace();
        }
        System.out.printf("After try date %1$ty-%1$tm-%1$td", date);

    }

    public static Date parse(String seq) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
        Date res = sdf.parse(seq);
        return res;
    }


}
