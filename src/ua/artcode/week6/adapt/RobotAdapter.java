package ua.artcode.week6.adapt;

/**
 *
 */
public class RobotAdapter extends Car {

    private Robot robot;

    public RobotAdapter(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void go() {
        robot.start();
    }
}
