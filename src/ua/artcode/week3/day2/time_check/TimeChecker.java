package ua.artcode.week3.day2.time_check;

/**
 * Created by admin on 25.11.2014.
 */
public class TimeChecker {


    public static void check(TimeAction actionObj){
        long start = System.currentTimeMillis();
        actionObj.action();
        System.out.println("Action time of " +
                actionObj.getClass().getSimpleName() +
                " is " + (System.currentTimeMillis() - start));

    }


}
