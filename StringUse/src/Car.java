public class Car {
    int noOfWheel;
    int noOfSeat;
    String carName;

    public Car(int noOfWheel, int noOfSeat, String carName) {
        this.noOfWheel = noOfWheel;
        this.noOfSeat = noOfSeat;
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "Car { " +
                "noOfWheel = " + noOfWheel +
                ", noOfSeat = " + noOfSeat +
                ", carName = '" + carName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car(4,5,"swift");
        System.out.println(car.toString());
    }
}