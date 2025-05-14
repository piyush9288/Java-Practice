import java.util.Scanner;

public class AreaAndCircumferenceOfaCircle {
    final double pi = Math.PI;

    public static void main(String[] args) {
        AreaAndCircumferenceOfaCircle pi = new AreaAndCircumferenceOfaCircle();
        // Calculate the area and circumference of a circle for a given radius
        //using Math.PI
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();

        double area = pi.pi * Math.pow(radius,2);
        double circumference = 2 * pi.pi * radius;
        System.out.printf("Area of circle = %.2f and Circumference of circle = %.2f", area , circumference);
    }
}
