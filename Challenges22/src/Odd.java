import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Odd {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);
        list.stream()
                .filter(num -> num % 2==0)
                .forEach(System.out::println);
    }
}
