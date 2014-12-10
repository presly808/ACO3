package ua.artcode.team_jira.service;

/**
 * Created by admin on 09.12.2014.
 */
public interface IProjectService {

    void createProject(Integer id, String name, Integer groupId);

    String getProjectInfo(Integer id);

}
