package ua.artcode.algo;

import java.math.BigInteger;

/**
 * Created by admin on 01.12.2014.
 */
public class TestFact {

    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("5");


        System.out.println(fact(new BigInteger("11")));

    }

    public static BigInteger fact(BigInteger num){
        return num.compareTo(new BigInteger("2")) < 0  ? BigInteger.ONE :
                num.multiply(fact(num.subtract(BigInteger.ONE)));
    }

    public static long fact(int num){
        return num < 2 ? 1 : num * fact(num-1);
    }

}

