import java.util.Scanner;

public class MinimumValueFIndUsingForEach {
    public static void main(String[] args) {
        //Create a program using for-each to find the maximum value in an integer array.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] num =  new int[size];
        for(int i = 0;i<size;i++){
            num[i] = input.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int arr : num){
            if(min > arr){
                min = arr;
            }
        }
        System.out.println("Minimum Value: " + min);
    }
}
