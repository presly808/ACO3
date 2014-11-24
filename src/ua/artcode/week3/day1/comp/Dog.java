package ua.artcode.week3.day1.comp;

public class Dog implements Comparable {

    private String callName;//null
    private int size;
    private int aggression;

    public Dog(String callName, int size, int aggression) {
        this.callName = callName;
        this.size = size;
        this.aggression = aggression;
    }

    public String getCallName() {
        return callName;
    }

    public void setCallName(String callName) {
        this.callName = callName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAggression() {
        return aggression;
    }

    public void setAggression(int aggression) {
        this.aggression = aggression;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "callName='" + callName + '\'' +
                ", size=" + size +
                ", aggression=" + aggression +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }

        if(this == obj){
            return true;
        }

        if(obj.getClass() != Dog.class){ //diff structures(types)
            return false;
        }

        Dog other = (Dog) obj;

        if(this.aggression == other.aggression && this.size == other.size &&
                this.callName != null && this.callName.equals(other.callName)){
            return true;
        }


        return false;
    }

    @Override
    public int compareTo(Object o) {
        Dog other = (Dog) o;

        if(this.aggression > other.aggression){
            return 1;
        } else if(this.aggression < other.aggression){
            return -1;
        } else {
            return 0;
        }
    }
}
