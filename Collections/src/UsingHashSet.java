import java.util.HashSet;
import java.util.Set;

public class UsingHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Ram");
        set.add("is");
        set.add("good");
        set.add("boy");
        System.out.println(set.contains("Ram"));
        System.out.println(set.size());
        set.remove("boy");
        PrintClass.print(set);
        System.out.println(set.isEmpty());
    }
}
