package ua.artcode.week4.day2;

public class TestGeneric {

    public static void main(String[] args) {
        GenericContainer container = new GenericContainer();

        GenericContainer<String, Integer> container1 =
                new GenericContainer<>();

        Integer i = container1.getTwo();
        String s = container1.getOne();


    }


}
