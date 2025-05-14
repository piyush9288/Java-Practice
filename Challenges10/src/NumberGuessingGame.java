import java.lang.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        int num = 0;
        int ran = (int)(Math.random() * 100);
        System.out.println(ran);
        do {
            System.out.println("please enter the number: ");
            num = Main.input();
        }while(num != ran);
        System.out.println("Wahooo! You win");
    }
}
