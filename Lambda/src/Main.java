import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Apple","Mango","Guava","Date");
//        for (String fruit : list) {
//            System.out.println(fruit);
//        }
        //using stream()
//        list.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String fruit) {
//                System.out.println(fruit);
//            }
//        });
        //using stream with lambda
//        list.stream().forEach(fruit -> System.out.println(fruit));
        //using stream with lambda and filter(filter the data ,endwiths(.endwiths e then print)
        list.stream()
                .filter(fruit-> fruit.endsWith("e"))
                //this is terminal operation when it is use then no return type but not use it is return type
                .forEach(fruit -> System.out.println(fruit));
    }
}