package ua.artcode.week1;

/**
 * Created by admin on 10.11.2014.
 */
public class MotorcycleUtils {

    public static Motorcycle getFaster(Motorcycle m1, Motorcycle m2){
        return m1.speed < m2.speed ? m1 : m2;
    }
}

