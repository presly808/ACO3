package ua.artcode.team_jira.service;

/**
 * Created by admin on 06.12.2014.
 */
public interface IUserService {

    void register(String login, String email, String pass);

    void login(String login, String pass);

}
