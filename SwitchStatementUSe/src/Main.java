import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of day: ");
        int day = input.nextInt();
        //create a switch statement
        oldSwitch(day);
        //new switch statement after java14
        newSwitch(day);

    }

    public static void newSwitch(int day){
        String output = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Holiday";
            //case 6 -> "Holiday"; //fall through
            //case 7 -> "Holiday";
            default -> "Invalid number";
        };
        System.out.println(output);
    }

    public static void oldSwitch(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6: //fall through
            case 7:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}