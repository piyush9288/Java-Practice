public abstract class Vehicle {
    private int noOfWheel;
    Vehicle(){
        this.noOfWheel=0;
    }
    Vehicle(int noOfWheel){
        this.noOfWheel=noOfWheel;
    }
    public abstract int noOfDoor();
//    public void start(){
//        System.out.println("Car is starting");
//    }
    public int getNoOfWheel(){
        return this.noOfWheel;
    }
}
