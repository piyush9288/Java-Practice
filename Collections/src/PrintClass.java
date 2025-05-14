import java.util.Collection;

public class PrintClass {
    //<E> this is generic and Java Collection means a single unit of objects. Java Collection
    // framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector,
    // LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
    public static <E> void print(Collection<E> collection){
        System.out.print("Collection is: ");
        for (E coll : collection) {
            System.out.printf("%s ",coll.toString());
        }
        System.out.println();
    }
}
