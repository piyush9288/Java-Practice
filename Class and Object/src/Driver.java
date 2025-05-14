public class Driver {
    public static void main(String[] args) {
        //class //reference = //create a object //constructor
//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.CurrentFull();
//        myCar.setCurrentFullLevel();
//        myCar.drive();

        Car swift = new Car();
        swift.addFuel(6);
        System.out.println(swift.color);
        //Car started = swift.start();
        //started.drive();
        swift.start().drive();
        swift.CurrentFull();
    }
}
