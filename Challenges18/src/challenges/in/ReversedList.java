package challenges.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversedList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(10);
        Collections.reverse(list);
        System.out.println(list);
        List<Integer> unmodifiable = Collections.unmodifiableList(list);
        unmodifiable.add(2);
        System.out.println(list);

    }
}
