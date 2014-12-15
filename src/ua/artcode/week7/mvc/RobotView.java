package ua.artcode.week7.mvc;

/**
 * Created by admin on 15.12.2014.
 */
public class RobotView {

    private RobotModel robotModel;

    public RobotView(RobotModel robotModel) {
        this.robotModel = robotModel;
    }

    public void show(){
        System.out.printf("Robot={power : %d, name : %s}",
                robotModel.getPower(),robotModel.getDesc());
    }


}
