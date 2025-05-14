package in.calculateArea;

public class Square extends Shape{
    private double length;
    private double breadth;
    @Override
    public void calculateArea(){
        double area = length * breadth;
        setArea(area);
    }

    public Square(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}
