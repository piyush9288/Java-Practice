package challenges.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountTheFrequency {

    public static void main(String[] args) {
        //Use the Collections class to count the frequency(occurrence) of a particular
        //element in an ArrayList.
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(10);
        System.out.println(Collections.frequency(list,10));

    }
}
