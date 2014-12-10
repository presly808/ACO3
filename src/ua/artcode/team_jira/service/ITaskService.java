package ua.artcode.team_jira.service;

import ua.artcode.team_jira.model.Task;

import java.util.List;

/**
 * Created by admin on 06.12.2014.
 */
public interface ITaskService {

    void addTask(String name, String desc, Integer priority, Integer state);

    void redirectTask(Integer userId);

    void changeStage(Integer stage);

    void removeTask(Integer id);

    List<Task> getAll();

}
