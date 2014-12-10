package ua.artcode.team_jira.service;

import ua.artcode.team_jira.exception.RegistrationException;

/**
 *
 */
public interface IUserService {

    void register(String login, String email, String pass) throws RegistrationException;

    void login(String login, String pass);

    void createTeam(Integer id, String name);

    void addUserToTeam(Integer userId, Integer teamId);

}
