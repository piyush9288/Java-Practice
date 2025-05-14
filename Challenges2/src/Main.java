import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
        System.out.println(firstNumber % secondNumber);

        float thirdNumber = input.nextFloat();
        float fourthNumber = input.nextFloat();

        System.out.println(thirdNumber * fourthNumber);

        System.out.println("Parameter of triangle: " + (firstNumber + secondNumber + thirdNumber + fourthNumber));
        System.out.println("Area of triangle: " + (thirdNumber * fourthNumber / 2));
        System.out.println("Simple Interest: " + (firstNumber * secondNumber * thirdNumber)/100);
        System.out.println("Compound Interest: " + (firstNumber * (Math.pow(1 + secondNumber / 100, fourthNumber))));
        System.out.println("celsius to fahrenheit: ");
        int fahrenheit = input.nextInt();
        System.out.println((fahrenheit - 32) * 5 / 9);

        //challenge complete
    }
}