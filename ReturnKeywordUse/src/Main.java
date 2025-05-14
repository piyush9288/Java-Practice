import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // sum of two number using method calling by user input
        greet();
        int num1 = readNumber(); //method call are just expression
        int num2 = readNumber();
        int sum = num1 + num2;
        System.out.println("sum is " + sum);
    }
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return input.nextInt();
    }
    public static void greet(){
        System.out.println("welcome to java coding");
    }
}