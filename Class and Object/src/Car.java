//class is just a blueprint
public class Car {
    //object is real Values in memory
    //create a properties
    int noOfWheels;
    //instance variable (currentFullInLiters)
    int currentFullInLiters;
    float currentSpeed;
    String color;
    int noOfSeats;

    // no argument constructor create
    Car(){
        noOfWheels = 4;
        color = "Black";
        noOfSeats = 5;
        currentSpeed = 0;
        currentFullInLiters = 2;
    }

    //create a method/behavior/attribute
    public void drive(){
        System.out.println("car is drive");
    }

    public Car start(){
        if(currentFullInLiters == 0){
            System.out.println("car is out of fuel");
        }
        else if(currentFullInLiters < 5){
            System.out.println("car is in reversed mode please, refuel");
        }
        else{
            System.out.println("car is Started");
            currentFullInLiters--;
        }
        return this;
    }

    public void setCurrentFullLevel(){
        System.out.println("car is driving");
        currentFullInLiters--;
    }

    public void CurrentFull(){
        System.out.println(currentFullInLiters);
    }

    public void addFuel(int currentFullInLiters){
        this.currentFullInLiters += currentFullInLiters;
    }
}