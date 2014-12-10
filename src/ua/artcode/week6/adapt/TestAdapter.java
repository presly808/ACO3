package ua.artcode.week6.adapt;

/**
 * Created by admin on 09.12.2014.
 */
public class TestAdapter {


    public static void main(String[] args) {
        Car car = new Car();
        Robot robot = new Robot();

        CarCrashMachine.crashTest(car);

        RobotAdapter robotAdapter = new RobotAdapter(robot);

        CarCrashMachine.crashTest(robotAdapter);
    }
}
