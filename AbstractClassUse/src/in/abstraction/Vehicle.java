package in.abstraction;

import java.util.Objects;

public abstract class Vehicle implements Transport{
    private int noOfWheel;

    public abstract void makeStaringSound(); //not definition defined ,passing responsibility to Car

    @Override
    public void getSetGo() {
        System.out.println("going to place....");
    }

    public Vehicle(int noOfWheel){
        this.noOfWheel = noOfWheel;
    }

    public int getNoOfWheel() {
        return noOfWheel;
    }

    public void setNoOfWheel(int noOfWheel) {
        this.noOfWheel = noOfWheel;
    }

    public void commits(){
        System.out.println("go......");
    }
}
