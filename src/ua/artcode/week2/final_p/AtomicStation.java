package ua.artcode.week2.final_p;

import java.util.Date;

public final class AtomicStation {

    private final int temperature;
    private final String desc;
    private final Date start = new Date();



    public AtomicStation(int temperature, String desc){
        this.temperature = temperature < 80 ? temperature : 80;
        this.desc = desc;
    }

    public void test(){
        start.setTime(45323432);
        //start = new Date();
    }

    public final void startAS(){
        //check conditions
        System.out.println("Start station");
    }
}
