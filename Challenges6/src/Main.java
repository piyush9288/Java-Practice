import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Create a program to find the sum and average of all elements in an array.
        int[] arr = userInput(); // when , use for 1-D then don't comment for this statement
        int sum1 = sum(arr);
        System.out.println("The Sum of the Array is: " + sum1);
        average(arr);

        //Create a program to find number of occurrences of an element in an array.
        numberOfOccurrences(arr);

        //Create a program to find the maximum and minimum element in an array.
        maximum(arr);
        minimum(arr);

        //Create a program to check if the given array is sorted.
        sorted(arr);

        //Create a program to return a new array deleting a specific element
        deletingSpecificElement(arr);

        // Create a program to reverse an array.
        reverseArray(arr);

        //Create a program to check is the array is palindrome or not.
        palindrome(arr);

        //Create a program to merge two sorted arrays.
        int[] arr1 = userInput();
        mergeTwoArray(arr,arr1);

        //Create a program to search an element in a 2-D array.
        int[][] arr2 = takeInput(); // when , use for 2-D then don't comment for this statement
        searchElement(arr2);

        //Create a program to do sum and average of all elements in a 2-D array.
        sum2D(arr2);
        average2D(arr2);

        // Create a program to find the sum of two diagonal elements.
        diagonalElement(arr2);
    }
    public static void diagonalElement(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i == j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("The Sum of the Main Diagonal Elements is: " + sum);
        sum = 0;
        for(int i = 0; i < arr.length; i++){
            int j = arr.length - 1 - i;
            sum += arr[i][j];
        }
        System.out.println("The Sum of the Secondary Diagonal Elements is: " + sum);
    }
    public static void average2D(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        int average = sum / (arr.length * arr[0].length);
        System.out.println("The Average of the Array is: " + average);
    }
    public static void sum2D(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("The Sum of the Array is: " + sum);
    }
    public static void searchElement(int[][] arr){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number to Search: ");
        int search = input.nextInt();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == search){
                    System.out.println("The Number is found at: " + i + " " + j);
                }
            }
        }
        System.out.println("The Number is not found");
    }
    public static int[][] takeInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }
    public static void mergeTwoArray(int[] arr, int[] arr1){
        int[] mergedArray = new int[arr.length + arr1.length];
        for(int i = 0; i < arr.length; i++){
            mergedArray[i] = arr[i];
        }
        for(int i = 0; i < arr1.length; i++){
            mergedArray[arr.length + i] = arr1[i];
        }
        System.out.print("The Merged Array is: ");
        for(int i = 0; i < mergedArray.length; i++){
            System.out.print(mergedArray[i] + " ");
        }
    }
    public static void palindrome(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length / 2; i++){
            if(arr[i] != arr[arr.length - 1 - i]){
                System.out.println("The Array is not a Palindrome");
                return;
            }
        }
        System.out.println("The Array is a Palindrome");
    }
    public static void reverseArray(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.print("The Array is Reversed: ");
        for(int i = arr.length-1 ; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
    public static void deletingSpecificElement(int[] arr){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number to Delete: ");
        int delete = input.nextInt();
        System.out.print("After Deleting the Number: ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != delete){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void sorted(int[] arr){
        int temp = 0;
        int size = arr.length;
        for(int i = 0; i < size - 1; i++){
            if(arr[i] > arr[i + 1]){
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.print("The Array is Sorted: " );
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void maximum(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            max = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < max){
                    max = arr[j];
                    arr[j] = arr[i];
                    arr[i] = max;
                }
            }
        }
        System.out.println("The Maximum element is: " + max);
    }
    public static void minimum(int[] arr){
        int min = 0;
        for(int i = 0; i < arr.length; i++){
            min = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > min){
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }
        System.out.println("The Minimum element is: " + min);
    }
    public static void numberOfOccurrences(int[] arr){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Target Number: ");
        int target = input.nextInt();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println("The Number of Occurrences of " + target + " is: " + count);
    }
    public static void average(int[] arr){
        int sum = sum(arr);
        int average = sum / arr.length;
        System.out.println("The Average of the Array is: " + average);
    }
    public static int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter a Number: ");
            sum += arr[i];
        }
        return sum;
    }
    public static int[] userInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Size of the Array: ");
        int length =  input.nextInt();
        int[] arr = new int[length];
        System.out.print("Enter a Number: ");
        for(int i = 0; i < length; i++){
            arr[i] = input.nextInt();
        }
        return arr;
    }
}

//challenges complete