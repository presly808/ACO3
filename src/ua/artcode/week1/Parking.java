package ua.artcode.week1;

/**
 * Created by admin on 10.11.2014.
 */
public class Parking {

    Motorcycle[] places = new Motorcycle[10];
    int parkingMan;


    public boolean addMoto(Motorcycle motorcycle){
        if(parkingMan < places.length){
            places[parkingMan++] = motorcycle;
            return true;
        }
        return false;
    }

    public Motorcycle takeLastMoto(){
        --parkingMan;
        if(parkingMan >= 0 && places[parkingMan] != null){
            Motorcycle temp = places[parkingMan];
            places[parkingMan] = null;
            return temp;
        }
        return null;
    }

    public String getParkingInfo(){
        int free = places.length - parkingMan;
        int lastFreePlace = parkingMan;
        String info = "Parking Info : \n*free places = " + free +
                "\n*last free place = " + lastFreePlace + "\n";
        for(int i = 0; i < lastFreePlace; i++){
            info += (i+1) + "." + places[i].showInfo() + "\n";
        }
        return info;
    }

}
