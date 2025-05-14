import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        //long fact = IntStream.rangeClosed(2,num)
        IntStream.rangeClosed(2,num)
                .reduce((a,b)->a*b)
                .ifPresent(System.out::println);
        //System.out.println("Factorial of " + num + " is: " + fact);
    }
}
