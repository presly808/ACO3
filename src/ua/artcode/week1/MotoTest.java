package ua.artcode.week1;

/**
 * Created by admin on 10.11.2014.
 */
public class MotoTest{

    public static void main(String[] args) {
        Motorcycle moto1 = new Motorcycle();
        moto1.model = "Honda";
        moto1.speed = 250;
       // moto1.showInfo();


        Motorcycle moto2 = new Motorcycle();
        moto2.model = "Java";
        moto2.speed = 120;
        //moto2.showInfo();

        boolean faster = moto1.isFaster(moto2);
        Motorcycle fasterMoto =
                MotorcycleUtils.getFaster(moto1, moto2);


        Racer racer = new Racer();
        racer.age = 17;
        racer.ex = 0;
        racer.buyMoto(moto2);
        racer.sayHello();
    }

}
