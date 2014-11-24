package ua.artcode.week3.day1;

import ua.artcode.week3.day1.comp.Dog;

public class TestEquals {


    public static void main(String[] args) {
        Dog dog1 = new Dog("Basrsic", 20, 10);
        Dog dog2 = new Dog("Basrsic", 20, 10);


        System.out.println("dog1 == dog2 " + (dog1 == dog2));
        System.out.println("dog1.equals(dog2) " + dog1.equals(dog2));
    }
}
