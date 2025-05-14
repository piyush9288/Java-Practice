public class Car {
    static int noOfCarSell;
    int noOfSeat;
    float maxSpeed;
    String color;

    //run once when class is loading
    static{
        noOfCarSell = 0;
        System.out.println("It is static code block");
    }

    //Blocks without static run each time an instance is created.(The number of initialization block run is equal to the number of object runs)
    {
        noOfCarSell++;
        System.out.println("It is default code block");
    }

    Car(String color){
        //this. means instance values
        this.color = color;
        maxSpeed = 180f;
        noOfSeat = 5;
    }

    Car(){
        this("Black"); // default color // this() constructor use to upper constructor value call
        maxSpeed = 200f;
    }

    public void setColor(){
        System.out.println("Car color is " + color);
    }

    public void setMaxSpeed(){
        System.out.println("Max Speed of Car is " + maxSpeed);
    }

    public void setNoOfSeat(){
        System.out.println("Number of seat are " + noOfSeat);
    }
}