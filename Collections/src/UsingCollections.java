import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UsingCollections {
    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<>();
        collection.add(5);
        collection.add(2);
        collection.add(6);
        collection.add(-12);
        PrintClass.print(collection);
        Collections.sort(collection);
        PrintClass.print(collection);
        Collections.reverse(collection);
        PrintClass.print(collection);
    }
}
