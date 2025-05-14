import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter the First Number : ");
        int firstNumber = input.nextInt();
        System.out.print("Now, Please Enter the Second Number : ");
        int secondNumber = input.nextInt();
        int temporaryNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temporaryNumber;
        System.out.println("First Number : " + firstNumber + "\nSecond Number : "+ secondNumber);
    }
}