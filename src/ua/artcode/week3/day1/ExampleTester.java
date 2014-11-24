package ua.artcode.week3.day1;

/**
 * Created by admin on 24.11.2014.
 */
public class ExampleTester {

    private ISportsman sportsman;

    public void testRun(){
        if(sportsman.run() < 0){
            System.out.println("Test is failed");
        }
    }


}


interface ISportsman {
    int run();
    int jump();
}
