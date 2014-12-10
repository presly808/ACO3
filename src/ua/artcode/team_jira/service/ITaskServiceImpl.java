package ua.artcode.team_jira.service;

import ua.artcode.team_jira.db.AppDataHolder;
import ua.artcode.team_jira.filter.CheckAccessFilter;
import ua.artcode.team_jira.model.Task;
import ua.artcode.team_jira.validation.TaskValidator;
import ua.artcode.team_jira.validation.UserValidator;

import java.util.List;

/**
 * Created by admin on 06.12.2014.
 */
public class ITaskServiceImpl implements ITaskService {

    private TaskValidator taskValidator;

    @Override
    public void addTask(String name, String desc, Integer priority, Integer state) {
        Task task = new Task(name, desc, priority, state);
        if(taskValidator.validate(task)){
            AppDataHolder.getINSTANCE().getTaskList().add(task);
        } else {
            System.out.println("Invalid task data, Try again");
            return;
        }
    }

    @Override
    public void removeTask(Integer id) {

    }

    @Override
    public List<Task> getAll() {
        return AppDataHolder.getINSTANCE().getTaskList();
    }
}
