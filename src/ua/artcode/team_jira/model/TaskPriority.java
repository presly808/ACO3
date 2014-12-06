package ua.artcode.team_jira.model;

/**
 *
 */
public enum TaskPriority { //extends Enum
    //final static TaskPriority MINOR = new TaskPriority();
    //final static TaskPriority MAJOR = new TaskPriority();

    MINOR(3, "not important task"), MAJOR(8, "very important task");
    //0                             1
    //MINOR                         MAJOR

    private final Integer range;
    private final String desc;

    private TaskPriority(Integer range, String desc) {
        this.range = range;
        this.desc = desc;
    }

    public Integer getRange() {
        return range;
    }

    public String getDesc() {
        return desc;
    }

}
