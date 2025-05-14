import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a program using do-while to find password checker until a valid password is entered.
        passwordChecker(password());
    }
    public static int password(){
        Scanner pass = new Scanner(System.in);
        System.out.println("Please , set the new password: ");
        return pass.nextInt();
    }
    public static void passwordChecker(int pass){
        int num =0;
        do{
            System.out.println("Please Enter the confirm password: ");
             num = input();
        }while(num != pass);
        System.out.println("password is correct");
    }

    public static int input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return in.nextInt();
    }
}