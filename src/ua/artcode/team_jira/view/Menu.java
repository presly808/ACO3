package ua.artcode.team_jira.view;

/**
 * Created by admin on 06.12.2014.
 */
public class Menu {

    private static class MenuItem {
        int order;
        String desc;

        private MenuItem(int order, String desc) {
            this.order = order;
            this.desc = desc;
        }
    }

    public final static MenuItem REGISTR = new MenuItem(1, "registe");

    public final static String REGISTRATION = "1. register";
    public final static String LOGIN = "2. login";
    public final static String NEW_TASK = "3. add new task";
    public final static String SHOW_ALL = "4. show all";
    public final static String EXIT = "5. exit";

    public static String genMenu(){
        StringBuilder sb = new StringBuilder();
        return  "";
    }




}
