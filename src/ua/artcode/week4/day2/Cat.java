package ua.artcode.week4.day2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public class Cat implements Serializable, Cloneable, Comparable<Cat> {



    private int age;
    private String home;
    private double weight;
    private int[] mas;

    public Cat() {
    }

    public Cat(int age, String home, double weight, int[] mas) {
        this.age = age;
        this.home = home;
        this.weight = weight;
        this.mas = mas;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int[] getMas() {
        return mas;
    }

    public void setMas(int[] mas) {
        this.mas = mas;
    }



    @Override
    public int compareTo(Cat o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", home='" + home + '\'' +
                ", weight=" + weight +
                ", mas=" + Arrays.toString(mas) +
                '}';
    }

    @Override
    public Cat clone() throws CloneNotSupportedException {
        Cat cloned = (Cat) super.clone();
        cloned.setHome(new String(home));
        cloned.setMas(Arrays.copyOf(mas,mas.length));
        return cloned;
    }

    public class OldWoman {
        int experience;
        boolean hasMan = false;



    }

    public static class CatAgeComparator implements Comparator<Cat>{

        @Override
        public int compare(Cat o1, Cat o2) {
            return o1.age - o2.age;
        }
    }
}
