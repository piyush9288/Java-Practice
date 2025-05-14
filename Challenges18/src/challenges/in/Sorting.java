package challenges.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        // Write a program that sorts a list of String objects in descending
        //order using a custom Comparator
        List<String> list = new ArrayList<>();
        list.add("C");
        list.add("B");
        list.add("A");
        Collections.sort(list);
        Print.print(list);
        Collections.reverse(list);
        Print.print(list);
    }
}
