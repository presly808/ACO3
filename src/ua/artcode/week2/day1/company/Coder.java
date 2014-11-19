package ua.artcode.week2.day1.company;

/**
 * Created by admin on 17.11.2014.
 */
public class Coder extends Worker {

    private int level;
    private int experience;

    public Coder() {
    }

    public Coder(String name, int age, double salary, int level, int experience) {
        super(name, age, salary);
        this.level = level;
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
