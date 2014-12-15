package ua.artcode.week7.mvc;

import ua.artcode.week6.adapt.Robot;

/**
 * Created by admin on 15.12.2014.
 */
public class TestMVC {


    public static void main(String[] args) {
        RobotModel model = new RobotModel(120, "D2R2");
        RobotView view = new RobotView(model);

        RobotController controller = new RobotController(model,view);

        controller.repaint();

    }
}
