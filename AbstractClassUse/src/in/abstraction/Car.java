package in.abstraction;

public class Car extends Vehicle{

    private int numberOfDoor;

    public Car() {
        super(4);
    }

    @Override
    public void makeStaringSound(){
        System.out.println("vroom.....");
    }
}
