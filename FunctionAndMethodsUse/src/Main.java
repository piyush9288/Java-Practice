//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("In main method");
        greetUser(); //invoke/call
        System.out.println("method calling completed");
        greetUser();
        //patterns print right angle
        starPoint();
    }

    public static void starPoint(){
        int start = 0;
        while(start < 5){
            System.out.print("*");
            int i = 0;
            while(i < start){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            start++;
        }
    }
    public static void greetUser(){
        System.out.println("Hello World");
    }
}