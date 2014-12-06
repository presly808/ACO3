package ua.artcode.team_jira.filter;

import ua.artcode.team_jira.model.User;

/**
 * Created by admin on 06.12.2014.
 */
public interface CheckAccessFilter {


    boolean doFilter(User user);

}
