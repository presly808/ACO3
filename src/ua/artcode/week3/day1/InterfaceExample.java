package ua.artcode.week3.day1;


public class InterfaceExample {
}

interface WorkerBehavior {
    void work();
}

interface StudentBehavior{
    void study();
}

class Worker implements WorkerBehavior {

    @Override
    public void work() {
        System.out.println("worker");
    }
}

class Student implements StudentBehavior, WorkerBehavior {

    @Override
    public void study() {
        System.out.println("student study");
    }

    @Override
    public void work() {
        System.out.println("student work");
    }
}

class Company {
    void testWorker(WorkerBehavior w){

    }
}
