package nestedClasses;

public class Car {
    private int noOfDoor;

    public void repair(){
        Tire t = new Tire();
    }


    protected class Tire{
        private int width;
        private int pressure;
        private int material;

        public void inflate(){
            noOfDoor = 4;
        }
    }
}
