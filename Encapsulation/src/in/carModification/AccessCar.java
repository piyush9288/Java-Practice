package in.carModification;

public class AccessCar {
    public static void main(String[] args) {
        Car car = new Car("Red","swift" ,20.0,120);
        System.out.printf("Color: %s Name: %s Fuel: %.2f L Speed: %.2f Km/s^2 \n",car.getColorOfTheCar()
                ,car.getNameOfCar(),car.getFuel(),car.getSpeed());
        car.setColorOfTheCar("Blue");
        car.setFuel(100);
        System.out.printf("Color: %s Name: %s Fuel: %.2f L Speed: %.2f Km/s^2",car.getColorOfTheCar(),car.getNameOfCar()
                ,car.getFuel(),car.getSpeed());

    }
}
