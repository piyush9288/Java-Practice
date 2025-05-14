import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Create a program that determines if a number is positive, negative, or zero.
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        if(number>0){
            System.out.println("Positive number");
        }
        else if(number<0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Zero");
        }

        //Create a program that determines if a number is odd or even.
        int number2 = Math.abs(number);
        if(number2 % 2 == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

        //Create a program that determines the greatest of the three numbers.
        System.out.print("Please enter First numbers: ");
        int num1 = input.nextInt();
        System.out.print("Please enter second numbers: ");
        int num2 = input.nextInt();
        System.out.print("Please enter Third numbers: ");
        int num3 = input.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("The greatest number is " + num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("The greatest number is " + num2);
        }else{
            System.out.println("The greatest number is " + num3);
        }

        //Create a program that determines if a given year is a leap year
        System.out.print("Please enter a year: ");
        int year = input.nextInt();
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("The year is a leap year");
        }
        else{
            System.out.println("The year is not a leap year");
        }

        //Create a program that calculates grades based on marks
        System.out.print("Please enter your marks: ");
        int marks = input.nextInt();
        if(marks>=90){
            System.out.println("You got an A");
        }else if(marks>=75){
            System.out.println("You got an B");
        }else if(marks>=60){
            System.out.println("You got an C");
        }else if(marks>=30){
            System.out.println("You got an D");
        }else if(marks < 30){
            System.out.println("You got an F");
        }else{
            System.out.println("Invalid marks");
        }

        //Create a program that categorize a person into different age groups
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        if(age<13){
            System.out.println("Child");
        }else if(age<20){
            System.out.println("Teenager");
        }else if(age<60){
            System.out.println("Adult");
        }else if(age>=60){
            System.out.println("Senior");
        }

        //Challenges Complete
    }
}