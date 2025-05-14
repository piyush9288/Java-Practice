import java.util.Scanner;

public class ContinuesStatement {
    public static void main(String[] args) {
        //Create a program using continue to sum all positive numbers entered by the user; skip any negative numbers.
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int i = 0;i<5;i++){
            System.out.print("Enter the Value: ");
            int first = input.nextInt();
            if(first < 0 ){
               continue;
            }
            sum+=first;
        }
        System.out.println("Value: " + sum);
    }
}
