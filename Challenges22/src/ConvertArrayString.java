import java.util.Arrays;
import java.util.stream.Stream;

public class ConvertArrayString {
    public static void main(String[] args) {
        String[] str = {"Ram","Shyam","Geeta"};
        Stream.of(str).forEach(System.out::println);
    }
}
