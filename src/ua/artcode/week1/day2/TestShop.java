package ua.artcode.week1.day2;

public class TestShop {

    public static void main(String[] args) {
        //show args Ctrl + P
        Shop shop = new Shop(30, 40000, "Kiev");
        Shop shop1 = new Shop(34.67);
        System.out.println(shop.getCount());
    }


}
