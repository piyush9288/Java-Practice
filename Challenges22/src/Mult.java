import java.util.List;
import java.util.Scanner;

public class Mult {
    public static void main(String[] args) {
        //multiUsingLambda
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = List.of(scanner.nextInt(), scanner.nextInt());
        int multi = list.stream()
                .reduce(1,(a,b)->a*b);
        System.out.printf("Multi: %d",multi);
    }
}