package ua.artcode.week1.day2;

public class MyNumber {

    private double val;

    public MyNumber(double val) {
        this.val = val;
    }

    public MyNumber add(MyNumber other){
        double res = this.val + other.val;
        return new MyNumber(res);
    }

    public MyNumber minus(MyNumber other){
        return new MyNumber(val - other.val);
    }

    public double getVal(){
        return val;
    }

}
