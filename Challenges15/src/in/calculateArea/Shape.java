package in.calculateArea;

public abstract class Shape {
    private double area;
    public abstract void calculateArea();
    public void setArea(double area){
        this.area  = area;
    }
    public double getArea(){
        return area;
    }
}
