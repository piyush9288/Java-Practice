import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for (int i = 1;i<=10;i++){
            int multi = i * num;
            System.out.println(num + " + " + i + " = " + multi);
        }
    }
}
