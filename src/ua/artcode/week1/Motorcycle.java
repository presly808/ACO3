package ua.artcode.week1;

public class Motorcycle {

    int speed;
    String model;

    public String showInfo(){
        return ("moto = {model - " + model +
                ", speed - " + speed + "}");
    }

    public boolean isFaster(Motorcycle other){
        return speed > other.speed;
    }

}
