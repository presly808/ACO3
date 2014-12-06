package ua.artcode.week5.day1;

/**
 *
 */
public class LazySingleton {

    private static LazySingleton INSTANCE = null;

    private LazySingleton(){}

    public static LazySingleton getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new LazySingleton();
        }

        return INSTANCE;
    }
}
