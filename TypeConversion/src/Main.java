public class Main {
    public static void main(String[] args) {
        // Big container <- small container (widening/ implicit /conversion )
        float number = 5;
        System.out.println(number);
        // Big container -> small container (Narrowing / explicit / casting)
        int number2 = (int) 5.0f;
        System.out.println(number2);
    }
}