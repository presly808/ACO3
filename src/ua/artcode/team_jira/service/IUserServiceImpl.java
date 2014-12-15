package ua.artcode.team_jira.service;

import ua.artcode.team_jira.db.AppDataHolder;
import ua.artcode.team_jira.exception.RegistrationException;
import ua.artcode.team_jira.model.User;
import ua.artcode.team_jira.validation.UserValidator;

import java.util.List;

/**
 * Created by admin on 06.12.2014.
 */
public class IUserServiceImpl implements IUserService {

    private UserValidator userValidator;


    @Override
    public void register(String login, String email, String pass)
            throws RegistrationException{
        List<User> userList = AppDataHolder.getINSTANCE().getUserList();

        User user = new User(login, pass, email);
        if(userList.contains(user)){
            throw new RegistrationException("Email or login already exists in db");
        }


        if(userValidator.validate(user)){
            userList.add(user);
        } else {
            return;
        }
    }

    @Override
    public void login(String login, String pass) {
        //TODO
        AppDataHolder.getINSTANCE().getUserList();
    }

    @Override
    public void createTeam(Integer id, String name) {

    }

    @Override
    public void addUserToTeam(Integer userId, Integer teamId) {

    }
}
