import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome the kg coding");
        System.out.println("Please , Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Please, Enter the second number: ");
        int num2 = input.nextInt();
        //this is ternary operator
        int greatestNumber = num1 > num2 ? num1 : num2;
        System.out.println("Greatest Number: " + greatestNumber);
    }
}