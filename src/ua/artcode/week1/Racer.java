package ua.artcode.week1;

/**
 * Created by admin on 10.11.2014.
 */
public class Racer {

    String name;
    int ex;
    int age;
    Motorcycle myMoto;// null

    public void sayHello(){
        System.out.println(name + ", " + age + ", ex = " + ex);
        if(myMoto != null){
            myMoto.showInfo(); // null.showInfo(); - NullPointerException
        } else {
            System.out.println("I dont have a moto");
        }
    }

    public void buyMoto(Motorcycle motorcycle){
        if(age < 18){
            System.out.println("Too young for moto");
        } else {
            myMoto = motorcycle;
        }
    }

}
