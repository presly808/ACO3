package ua.artcode.week7.mvc;

/**
 * Created by admin on 15.12.2014.
 */
public class RobotController {

    private RobotModel model;
    private RobotView view;

    public RobotController(RobotModel model, RobotView view) {
        this.model = model;
        this.view = view;
    }

    public void repaint(){
        view.show();
    }

    public RobotModel getModel() {
        return model;
    }

    public void setModel(RobotModel model) {
        this.model = model;
    }

    public RobotView getView() {
        return view;
    }

    public void setView(RobotView view) {
        this.view = view;
    }
}
