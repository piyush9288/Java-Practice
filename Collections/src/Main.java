import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("This");
        list.add("is");
        list.add(1,"video");
        list.add("sponsored");
        list.add("by");
        list.add("KGCoding");
        //list.set(5,"classes"); //replace
        //System.out.println(list.get(2));
        System.out.println(list);
        System.out.println(list.size());
        //list.remove("This");
        //list.remove(1);
        //System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}