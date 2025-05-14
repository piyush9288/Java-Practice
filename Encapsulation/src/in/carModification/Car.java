package in.carModification;

public class Car {
        //Encapsulation : hidden the data -> access through the method using getter and setter
        //not always use public modifier .it's only use for share the data
        // private and default use
        // private -> only access in class
        // default -> only access in same package
        private String colorOfTheCar;
        private String nameOfCar;
        private double fuel;
        private double speed ;

    public Car(String colorOfTheCar,String nameOfCar, double fuel, double speed) {
        this.colorOfTheCar = colorOfTheCar;
        this.nameOfCar = nameOfCar;
        this.fuel = fuel;
        this.speed = speed;
    }
    //getter: retrieve(got) the value
    public String getNameOfCar(){
        return nameOfCar;
    }

    public void setFuel(double fuel){
        this.fuel = fuel;
    }

    public double getFuel(){
        return fuel;
    }

    public double getSpeed(){
        return speed;
    }

    public String getColorOfTheCar(){
        return colorOfTheCar;
    }

    public void setColorOfTheCar(String colorOfTheCar){
        this.colorOfTheCar = colorOfTheCar;
    }


}