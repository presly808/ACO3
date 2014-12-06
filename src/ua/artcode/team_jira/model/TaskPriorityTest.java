package ua.artcode.team_jira.model;

/**
 * Created by admin on 06.12.2014.
 */
public class TaskPriorityTest {

    public static void main(String[] args) {
        TaskPriority maj = TaskPriority.MAJOR;

        System.out.println("order " + maj.ordinal() +
                " name " + maj.name());
        TaskPriority min = TaskPriority.valueOf("MINOR");

        TaskPriority[] priorities = TaskPriority.values();
        TaskPriority.valueOf(TaskPriority.class, "MINOR");
    }

}
