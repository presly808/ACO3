package ua.artcode.week2.game;

/**
 * Created by admin on 18.11.2014.
 */
public class GameCharacter {

    private String name;
    private int health;
    private Weapon weapon;

    public GameCharacter(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void fight(GameCharacter enemy){
        enemy.takeDamage(weapon.use());
    }

    public void takeDamage(int damage){
        health -= damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
