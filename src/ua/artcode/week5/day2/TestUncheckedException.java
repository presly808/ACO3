package ua.artcode.week5.day2;

/**
 * Created by admin on 07.12.2014.
 */
public class TestUncheckedException {

    public static void main(String[] args) {
        a();
        System.out.println("after a()");
    }

    public static void a(){
        b();
    }


    public static void b(){
        int[] mas = new int[2];
        int res = mas[6];
        c();
    }

    public static void c(){
        String s = null;
        s.toString();
        System.out.println("after c");
    }
}
