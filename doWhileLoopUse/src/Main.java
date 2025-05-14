import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //simple while loop
//        System.out.print("Enter the number: ");
//        int age = input.nextInt();
//        while(age <0 || age >100){
//            System.out.print("Enter the number: ");
//            age = input.nextInt();
//        }
//        System.out.print("your age is : " + age);

        //do-while loop use
        int age;
        do{
            System.out.print("Enter the number: ");
            age = input.nextInt();
        }while(age <0 || age >100);
        System.out.print("your age is : " + age);
    }
}