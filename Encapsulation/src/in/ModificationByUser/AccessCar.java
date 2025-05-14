package in.ModificationByUser;

import in.carModification.Car;

public class AccessCar {
    public static void main(String[] args) {
        Car car = new Car("Black", "BMW",100,300);
        System.out.printf("Color: %s Name: %s Fuel: %.2f L Speed: %.2f Km/s^2 \n",car.getColorOfTheCar()
                ,car.getNameOfCar(),car.getFuel(),car.getSpeed());
    }
}
