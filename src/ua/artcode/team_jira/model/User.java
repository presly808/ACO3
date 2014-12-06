package ua.artcode.team_jira.model;

/**
 * Created by admin on 06.12.2014.
 */
public class User {

    private Integer id;
    private String login;
    private String pass;
    private String email;

    public User() {
    }

    public User(String login, String pass, String email) {

        this.login = login;
        this.pass = pass;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
