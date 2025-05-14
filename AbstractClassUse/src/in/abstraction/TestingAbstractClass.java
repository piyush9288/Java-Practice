package in.abstraction;

public class TestingAbstractClass {
    public static void main(String[] args) {
        Car car = new Car();
        car.makeStaringSound();
        car.commits();
        System.out.println(car.getNoOfWheel());
    }
}
