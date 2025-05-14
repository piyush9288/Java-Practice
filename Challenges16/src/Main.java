public class Main {
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void sum(double a, double b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        sum(2,3);
        sum(2.0,4.0);
        sum(4,5,6);
    }
}