import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Develop a program that prints the multiplication table for a given number.
        int num1 = numberInput();
        int nTimes = numberInput();
        System.out.println( "Multiply of two number: " + multiplicationTable(num1,nTimes));

        //Create a program to sum all odd numbers from 1 to a specified number N.
        int n = numberInput();
        System.out.print("Sum of odd numbers from 1 to a specified number N: " + sumOddNumber(n));

        //Write a function that calculates the factorial of a given number.
        int fact = numberInput();
        System.out.print("Factorial: " + factorial(fact));

        //Create a program that computes the sum of the digits of an integer.
        int res = numberInput();
        System.out.println( "Sum of digits: " + sumDigit(res));

        //Create a program to find the Least Common Multiple (LCM) of two numbers.
        int lcm1 = numberInput();
        int lcm2 = numberInput();
        System.out.println( "Least Common Multiple: " + leastCommonMultiple(lcm1,lcm2));

        //Create a program to find the Greatest Common Divisor (GCD) of two integers
        int gcd1 = numberInput();
        int gcd2 = numberInput();
        System.out.println("Greatest Common Divisor: " + greatestCommonDivisor(gcd1,gcd2));

        //Create a program to check whether a given number is prime
        int prime = numberInput();
        boolean checkPrime = isPrime(prime);
        if(checkPrime) System.out.println("Prime");
        else System.out.println("Not Prime");

        //Create a program to reverse the digits of a number.
        int reverse = numberInput();
        System.out.println( "Reverse: " + reverseOrder(reverse));

        //Create a program to print the Fibonacci series up to a certain number.
        int fibo = numberInput();
        fibonacciSeries(fibo);

        //Create a program to check if a number is an Armstrong number.
        int arm = numberInput();
        armstrongNumber(arm);

        //Create a program to verify if a number is a palindrome
        int palindrome = numberInput();
        int rev1= reverseOrder(palindrome);
        System.out.println("Reverse: " + palindromeNumber(rev1,palindrome));

    }
    public static boolean palindromeNumber(int num,int palindrome){
        if(num == palindrome) return true;
        else return false;
    }
    public static void armstrongNumber(int num){
        int temp = num;
        int sum = 0;
        while(num != 0){
            sum += Math.pow(num%10 , 3);
            num/=10;
        }
        if(temp == sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
    public static void fibonacciSeries(int n){
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.print( firstNumber + " " + secondNumber);
        for(int i = 0; i<n; i++){
            int sum = firstNumber + secondNumber;
            System.out.print(" " + sum);
            firstNumber = secondNumber;
            secondNumber = sum;
        }
    }
    public static int reverseOrder(int num){
        int rev = 0;
        while(num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
    public static boolean isPrime(int n){
        if(n == 1) return false;
        for(int i=2; i<n/2;i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    public static int greatestCommonDivisor(int n, int m){
       if(n == 0 || m == 0) return 0;
       if(n == m) return n;
       int div = 1;
       while(true){
           if(n%div == 0 && m%div == 0){
               return div;
           }
           else div++;
       }
    }
    public static int leastCommonMultiple(int n, int m){
        if(n == 0 || m == 0) return 0;
        if(n == m) return n;
        int mul = 1;
        while(true){
            if((n*mul)%m == 0){
                return n*mul;
            }
            else if ((m*mul)%n == 0){
                return m*mul;
            }
            else mul++;
        }
    }

    public static int sumDigit(int num){
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
            // sum of number but print single digit than this algo use
//            if(num == 0 && sum > 9){
//                num = sum;
//                sum = 0;
//            }
        }
        return sum;
    }
    public static int factorial(int n){
        int fact = 1;
        int fact1 = 1;
        if(n == 1 || n == 0) return 1;
        while(fact <= n){
            fact1 *= n;
            n--;
        }
        return fact1;
    }
    public static int sumOddNumber(int n){
        int sum = 0;
        while(n > 0){
            if(n % 2 != 0) {
                sum += n;
            }
            n--;
        }
        return sum;
    }
    public static int numberInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return input.nextInt();
    }
    public static int multiplicationTable(int num1,int nTimes){
        for(int i = 1; i<=nTimes; i++){
            System.out.println(num1 + " * " + i + " = " + num1*i);
        }
    }
}
//challenge complete