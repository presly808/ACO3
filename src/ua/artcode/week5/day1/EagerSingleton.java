package ua.artcode.week5.day1;

/**
 *
 */
public class EagerSingleton {

    private static EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getINSTANCE() {
        return INSTANCE;
    }


}
