import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number: ");
        int num = input.nextInt();
        boolean isPrime = true;
        if(num<=1){
            isPrime = false;
        }
        else{
            for(int i = 2 ; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(num + " Prime : " + isPrime);
    }
}
