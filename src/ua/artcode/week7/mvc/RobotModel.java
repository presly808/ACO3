package ua.artcode.week7.mvc;

/**
 *
 */
public class RobotModel {

    private int power;
    private String desc;

    public RobotModel(int power, String desc) {
        this.power = power;
        this.desc = desc;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
