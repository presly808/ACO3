package ua.artcode.week8;

/**
 * Created by admin on 22.12.2014.
 */
public class Human {

    private String name;
    private int age;
    private long count;
    private double salary;
    private boolean isSingle;

    public Human() {
    }

    public Human(String name, int age, long count,
                 double salary, boolean isSingle) {
        this.name = name;
        this.age = age;
        this.count = count;
        this.salary = salary;
        this.isSingle = isSingle;
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

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isSingle() {
        return isSingle;
    }

    public void setSingle(boolean isSingle) {
        this.isSingle = isSingle;
    }

    // JIT - Just In Time
    // 31 * n = (n << 5) - n // ?
    @Override
    public int hashCode() {
        int hash = 1;
        hash = 31 * hash + age;
        hash = 31 * hash + (name != null ? name.hashCode() : 0);
        hash = 31 * hash + (int)(count ^ (count >> 32)); // 0 ^ 1 = 1 1 ^ 1 = 0 0 ^ 0 = 0
        long l = Double.doubleToLongBits(salary);
        hash = 31 * hash + (int)(l ^ (l >> 32));
        hash = 31 * hash + (isSingle ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj.getClass() != Human.class){
            return false;
        }

        Human other = (Human) obj;

        return this.age == other.age
                && (this.name != null ? name.equals(other.name) : other.name == null)
                && this.count == other.count
                && Double.doubleToLongBits(this.salary) == Double.doubleToLongBits(other.salary)
                && this.isSingle == other.isSingle;

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", count=" + count +
                ", salary=" + salary +
                ", isSingle=" + isSingle +
                '}';
    }
}
