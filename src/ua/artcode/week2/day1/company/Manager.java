package ua.artcode.week2.day1.company;

public class Manager extends Worker {

    private Coder[] places = new Coder[4];

    public Manager() {
    }

    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    public void manage(){
        for(int i = 0; i < places.length && places[i] != null; i++){
            places[i].work();
        }
    }

    public Coder[] getPlaces() {
        return places;
    }

    public void setPlaces(Coder[] places) {
        this.places = places;
    }
}
