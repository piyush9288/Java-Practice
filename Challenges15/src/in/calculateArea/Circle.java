package in.calculateArea;

public class Circle extends Shape{
    private double radius;
    @Override
    public void calculateArea(){
        double area = Math.PI * Math.pow(radius,2);
        setArea(area);
    }
    public Circle(double radius){
        this.radius = radius;
    }
}
