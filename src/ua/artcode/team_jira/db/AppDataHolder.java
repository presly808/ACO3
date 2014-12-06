package ua.artcode.team_jira.db;

import ua.artcode.team_jira.model.Task;
import ua.artcode.team_jira.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class
 */
public class AppDataHolder {

    private List<User> userList;
    private List<Task> taskList;

    //TODO Load from file
    private AppDataHolder(){
        userList = new ArrayList<>();
        taskList = new ArrayList<>();
    }

    private static AppDataHolder INSTANCE = null;

    public static AppDataHolder getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new AppDataHolder();
        }
        return INSTANCE;
    }


    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}
