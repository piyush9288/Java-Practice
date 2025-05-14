package challenges.in;

import java.util.Collection;

public class Print {
    public static <E> void print(Collection<E> collection){
        System.out.print("Collection is: ");
        for(E col : collection){
            System.out.printf("%s ",col.toString());
        }
        System.out.println();
    }
}
