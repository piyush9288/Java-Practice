import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Create a program to input name of the person and respond with ”Welcome NAME to KG Coding”
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to KG Coding");
        //Create a program to add two numbers
        System.out.print("Please, Enter first number: ");
        int firstInput  = input.nextInt();
        System.out.print("Now Please, Enter second number: ");
        int secondInput = input.nextInt();
        System.out.println("add two numbers: " + (firstInput + secondInput));
        //Challenges complete
    }
}