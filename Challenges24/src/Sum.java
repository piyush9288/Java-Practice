import java.util.Arrays;
import java.util.List;

public class Sum {
        public static void main(String[] args) {
            List<String> numberStrings = Arrays.asList("1", "2", "3", "4", "5");

            int sumOfSquares = numberStrings.stream()
                    .map(Integer::parseInt)       // Convert String to Integer
                    .map(n -> n * n)              // Square each number
                    .mapToInt(Integer::intValue)  // Convert Stream<Integer> to IntStream
                    .sum();                       // Sum all squared values

            System.out.println("Sum of squares: " + sumOfSquares);
        }
}
