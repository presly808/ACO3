package ua.artcode.week2.final_p;

/**
 * Created by admin on 18.11.2014.
 */
public class Chernobyl {

    private AtomicStation atomicStation;

    public Chernobyl(AtomicStation atomicStation) {
        this.atomicStation = atomicStation;
    }

    public void run(){
        atomicStation.startAS();
    }

    public AtomicStation getAtomicStation() {
        return atomicStation;
    }

    public void setAtomicStation(AtomicStation atomicStation) {
        this.atomicStation = atomicStation;
    }
}
