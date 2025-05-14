import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial calculator\n");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        //System.out.println(factorialGenerator(num));
        System.out.println(factorialGeneratorUseRecursion(num));
    }
    //recursion use
    public static long factorialGeneratorUseRecursion(int num){
        if(num == 1){
            return num;
        }
        return num * factorialGeneratorUseRecursion(num - 1);
    }

    //faction use
    public static long factorialGenerator(int num){
        int fact = 1;
        for(int i = 1;i<=num;i++){
            fact *= i;
        }
        return fact;
    }
}