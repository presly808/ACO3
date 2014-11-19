package ua.artcode.week2.day1.company;

/**
 * Created by admin on 17.11.2014.
 */
public class ToStringTest {
    public static void main(String[] args) {
        Tester t = new Tester("Oleg", 30, 3000, "MANUAL");
        Worker worker = new Coder("Andriy", 24,1400,2,4);
        Worker worker1 = new Tester("Ivan", 22, 1500, "MANUAL");
        System.out.println(t);
        System.out.println(worker);
        System.out.println(worker1);
    }
}
