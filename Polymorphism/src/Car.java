public class Car extends Vehicle{

    Car(){
        super(4);
    }
//    Car(){
//        super();
//    }
    @Override
    public int noOfDoor(){
        return 5;
    }

    public void start(){
        System.out.println(super.getNoOfWheel());
        System.out.println("Car is starting");
    }


}
