package ua.artcode.week2.game;

public abstract class Weapon {

    int duration = 100;

    public Weapon(){
    }

    /**
     * this method must be override by sub class
     * */
    public abstract int use();

    private void minusDuration(){
        duration -= 10;
    }




}
