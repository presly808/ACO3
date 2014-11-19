package ua.artcode.week2.game;

public class TestGame {

    public static void main(String[] args) {
        Sword sword = new Sword();
        Knife knife = new Knife();

        GameCharacter human = new GameCharacter("Vasia",100, sword);
        GameCharacter troll = new GameCharacter("Troll", 150, knife);

        System.out.println("Before fight\n" + human + "\n" + troll);
        human.fight(troll);
        System.out.println("After fight\n" + human + "\n" + troll);
    }

}
