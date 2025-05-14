package in.inheritance;
//by default use in java (public class Vehicle extends Object{equals(),
//hashCode(), toString(), and getClass()})
public class Vehicle {
    //protected is used to only in same package and subclass(child class)
    protected int numberOfTiers;
    public void commits(){
        System.out.println("Number of tiers is zero");
    }
}