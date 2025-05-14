import java.util.List;
import java.util.stream.Collectors;

public class Concatenate {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "watermelon", "banana", "strawberry", "grape", "kiwi");
        String str = list.stream()
                .filter(word->word.length()<10)
                .collect(Collectors.joining(" "));
        System.out.printf("Fruit : %s",str);
    }
}
