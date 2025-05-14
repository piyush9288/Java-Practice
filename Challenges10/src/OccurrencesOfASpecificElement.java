import java.util.Scanner;

public class OccurrencesOfASpecificElement {
    public static void main(String[] args) {
        //Create a program using for-each to the occurrences of a specific element in an array.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of arrays: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the number: ");
        for (int i = 0;i<size;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the target number: ");
        int target = input.nextInt();
        int count =0;
        for(int check : arr){
            if(check == target){
                count++;
            }
        }
        System.out.println("Number of occurrence: " + count);
    }
}
