import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {
        //Create a program using break to read inputs from the user in a loop and break the loop if a specific keyword (like "exit") is entered.
        Scanner input = new Scanner(System.in);
        String exit = "exit";
        for(int i = 0;i<1000;i++){
            System.out.print("Enter the Value: ");
            String first = input.nextLine();
            if(first.equals(exit)){
                break;
            }
            System.out.println("Value: " + first);
        }
    }
}
