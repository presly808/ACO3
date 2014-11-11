package ua.artcode.week1.day2;

public class Shop {

    private int count;
    private double amount;
    private String city;

    // /without args is default constructor
    public Shop(){
        System.out.println("In default constructor");
    }

    public Shop(int count, double amount, String city){
        this.count = count;
        this.amount = amount;
        this.city = city;
    }

    public Shop(int count, double amount){
        this.count = count;
        this.amount = amount;
    }

    public Shop(double amount){
        this.amount = amount;
    }

    public void setCount(int count){
        if(count < 0){
            return;
        }
        this.count = count;
    }

    public int getCount(){
        return count;
    }

}
