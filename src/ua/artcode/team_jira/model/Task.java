package ua.artcode.team_jira.model;

/**
 * Created by admin on 06.12.2014.
 */
public class Task {

    private Integer id;
    private String name;
    private String desc;
    private Integer priority;
    private Integer state;

    public Task() {
    }

    public Task(Integer id, String name, String desc, Integer priority, Integer state) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.priority = priority;
        this.state = state;
    }

    public Task(String name, String desc, Integer priority, Integer state) {
        this.name = name;
        this.desc = desc;
        this.priority = priority;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", priority=" + priority +
                ", state=" + state +
                '}';
    }
}
