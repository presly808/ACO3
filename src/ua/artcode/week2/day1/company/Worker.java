package ua.artcode.week2.day1.company;

public class Worker {

    private String name;
    private int age;
    private double salary;

    // Alt + Ins
    public Worker() {
        super();
    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker = name: " + name +" age: " + age + " sal: " + salary;
    }

    public void work(){
        System.out.println(toString() + " is working");
    }


}
