package ua.artcode.team_jira.view;

import ua.artcode.team_jira.service.ITaskService;
import ua.artcode.team_jira.service.ITaskServiceImpl;
import ua.artcode.team_jira.service.IUserService;

/**
 *
 */
public class MenuPage {

    private ITaskService taskService = new ITaskServiceImpl();
    private IUserService userService;

    public void start() {
          taskService.getAll();
    }

}
