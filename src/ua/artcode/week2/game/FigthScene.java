package ua.artcode.week2.game;

/**
 * Created by admin on 18.11.2014.
 */
public class FigthScene {

    public void start(GameCharacter character1, GameCharacter character2){

        boolean choose = (((int) (Math.random() * 100)) % 2) == 0;

        while(character1.getHealth() > 0 && character2.getHealth() > 0){
            if(choose){
                character1.fight(character2);
            } else {
                character2.fight(character1);
            }
            choose = !choose;
        }

        System.out.println(character1.getHealth() > 0);

    }


}
