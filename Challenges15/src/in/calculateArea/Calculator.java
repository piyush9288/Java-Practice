package in.calculateArea;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Square square = new Square(2,3);
        circle.calculateArea();
        square.calculateArea();
        System.out.println(circle.getArea());
        System.out.println(square.getArea());
    }
}
