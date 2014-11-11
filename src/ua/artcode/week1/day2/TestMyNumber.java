package ua.artcode.week1.day2;

public class TestMyNumber {

    public static void main(String[] args) {
        MyNumber num1 = new MyNumber(22.33);
        MyNumber num2 = new MyNumber(40);

        MyNumber res = num1.add(num2);

        System.out.println(res.getVal());
    }

}
