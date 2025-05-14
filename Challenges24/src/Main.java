import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,6,4,5,5};
        List<Integer> ans = Arrays.stream(arr)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}