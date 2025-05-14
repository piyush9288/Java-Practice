public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        //Vehicle vehicle = new Vehicle();
        //upCasting(implicit)
//        Vehicle vec = new Car();
//        castTest(vehicle);
        castTest(car);

    }
    public static void castTest(Vehicle veh){

        //downCasting(Explicit)
        Car car = (Car) veh;
        car.start();
        System.out.println(car.noOfDoor());
    }

}
