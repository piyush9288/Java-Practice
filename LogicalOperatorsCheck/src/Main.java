import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your age: ");
        int age = input.nextInt();
        System.out.println("Please Enter your gender: ");
        String gender = input.next();
        System.out.println("You are Senior citizen (True/False): ");
        boolean isSeniorCitizen = input.nextBoolean();
        if(age<=5 && gender.equals("Female")){
            System.out.println("75% discount on metro ticket");
        }else if(age>=5 && gender.equals("Male") && !isSeniorCitizen){
            System.out.println("No discount on metro ticket");
        }
        else if(isSeniorCitizen && gender.equals("Female") && age>=60){
            System.out.println("50% discount on metro ticket");
        }else if(age>=60){
            System.out.println("25% discount on metro ticket");
        }
    }
}