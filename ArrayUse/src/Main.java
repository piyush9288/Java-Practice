import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        //int[] arr = {9,8,4,5,6};
        for(int i=0;i<5;i++){
            System.out.print("Enter number: ");
            arr[i] = input.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println("index " + i + " - " +arr[i]);
        }
    }
}