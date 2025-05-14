import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Arithmetic Exception Handling
        // Write a program that asks the user to enter two integers and
        //then divides the first by the second. The program should
        //handle any arithmetic exceptions that may occur (like
        //division by zero) and display an appropriate message.
        // Key Points:
        // • Use Scanner to read user input.
        // • Implement a try-catch block to handle ArithmeticException.
        // • Display a user-friendly message if division by zero occurs.
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter the first number: ");
            int first = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int second = scanner.nextInt();
            int divisor = first / second;
            System.out.println("The result of dividing " + first + " by " + second + " is: " + divisor);
        }catch (ArithmeticException exception){
            if(exception.getMessage().equals("/ by zero")){
                System.out.println("Error: Cannot divide by zero. Please provide a non-zero divisor.");
            }
            else {
                throw exception;
            }

        }finally {
            scanner.close();
        }
    }
}