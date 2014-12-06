package ua.artcode.team_jira.service;

import ua.artcode.team_jira.db.AppDataHolder;
import ua.artcode.team_jira.model.User;
import ua.artcode.team_jira.validation.UserValidator;

/**
 * Created by admin on 06.12.2014.
 */
public class IUserServiceImpl implements IUserService {

    private UserValidator userValidator;


    @Override
    public void register(String login, String email, String pass) {
        User user = new User(login, pass, email);
        if(userValidator.validate(user)){
            AppDataHolder.getINSTANCE().getUserList().add(user);
        } else {
            return;
        }
    }

    @Override
    public void login(String login, String pass) {
        //TODO
        AppDataHolder.getINSTANCE().getUserList();
    }
}
