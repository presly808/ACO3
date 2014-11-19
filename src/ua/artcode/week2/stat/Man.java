package ua.artcode.week2.stat;

/**
 * Created by admin on 17.11.2014.
 */
public class Man {

    private static int count;

    // run during loading class
    static {
        count = 0;
    }

    // general block for all constructors
    {
        count++;
    }


    private int number;

    public Man() {
    }

    public Man(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void nonStaticMeth(){
        count++;
    }

    public static void statMeth(){

    }
}
