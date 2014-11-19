package ua.artcode.week2.day1.company;

/**
 * Created by admin on 17.11.2014.
 */
public class CastingTest {


    public static void main(String[] args) {
        doCode(new Tester());
        doCode(new Coder());
        doCode(new Manager());

    }

    public static void doCode(Worker w){
        //instanceof

        if(w instanceof Coder){
            System.out.println("w can be cast to coder");
            Coder c = (Coder) w;
            c.getExperience();
        } else {
            System.out.println("w is not coder");
        }
    }

}
