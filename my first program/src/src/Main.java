// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int a = input.nextInt();
          int b = input.nextInt();
          int c = input.nextInt();
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int num3 = input.nextInt();
//
//        if(num1 > num2 && num1 > num3){
//            System.out.println(num1);
//        }
//        else if(num2 > num1 && num2 > num3){
//            System.out.println(num2);
//        }
//        else{
//            System.out.println(num3);
//        }

        int max = Math.max(c, Math.max(a , b));
        System.out.println(max);
    }
}