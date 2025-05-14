import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Now Please, enter another number: ");
        int num2 = input.nextInt();

        //Create a program that shows bitwise AND of two numbers.
        System.out.println("AND Operator: " + (num1 & num2));
        //Create a program that shows bitwise OR of two numbers.
        System.out.println("OR Operator: " + (num1 | num2));
        // Create a program that shows bitwise XOR of two numbers
        System.out.println("XOR Operator: " + (num1 ^ num2));
        // Create a program that shows bitwise compliment of a number.
        System.out.println("Compliment Operator: " + ~num1);
        System.out.println("Compliment Operator: " + ~num2);
        //Create a program that shows use of left shift operator.
        System.out.print("How many left shift: ");
        int shift = input.nextInt();
        System.out.println("Left Shift Operator: " + (num1<<shift));
        //Create a program that shows use of right shift operator.
        System.out.println("Right Shift Operator: " + (num1>>shift));

        //Write a program to check if a given number is even or odd using bitwise operators.
        System.out.print("Please, enter the numbers: ");
        int Number = input.nextInt();

        if((Number & 1 )==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

    }
}