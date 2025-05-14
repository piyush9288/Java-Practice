import java.util.Scanner;

public class GuessNumber {
    public static int value = (int)(Math.random()*10);
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int value1 = 0;
        int count = 0;
        while(value1 != GuessNumber.value){
            System.out.print("Guess the number 0 to 10: ");
            value1 = sc.nextInt();
            count++;
            continue;
        }
        System.out.printf("You Win! into %d times." , count  );
    }
}
