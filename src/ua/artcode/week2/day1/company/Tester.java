package ua.artcode.week2.day1.company;


public class Tester extends Worker {

    private String type;

    public Tester(){
        super();
    }

    public Tester(String name, int age,
                  double salary, String type) {
        super(name, age, salary);
        this.type = type;
    }

    public void test() {
        setName("Andriy");
    }

    //overriding
    public void work(){
        System.out.println("Tester is working");
    }

}
