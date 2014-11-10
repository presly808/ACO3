package ua.artcode.week1;

/**
 * Created by admin on 10.11.2014.
 */
public class TestParking{

    public static void main(String[] args) {
        Parking parking = new Parking();

        Motorcycle moto0 = new Motorcycle();
        moto0.model = "Honda";
        moto0.speed = 210;

        Motorcycle moto1 = new Motorcycle();
        moto1.model = "Yamaha";
        moto1.speed = 200;

        Motorcycle moto3 = new Motorcycle();
        moto3.model = "Java";
        moto3.speed = 120;

        Motorcycle moto4 = new Motorcycle();
        moto4.model = "Suzuki";
        moto4.speed = 300;

        parking.addMoto(moto0);
        parking.addMoto(moto1);
        parking.addMoto(moto4);
        parking.addMoto(moto3);


        System.out.println(parking.getParkingInfo());

    }
}
