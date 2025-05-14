import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create a driving licence are eligible or not when ,if age is 18+ then true else false
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        if(age>=18){
            System.out.println("Your are eligible for driving licence");
        }else{
            System.out.println("Your are not eligible for driving licence");
        }
    }
}