import java.util.List;
import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,5,4,6);
        Optional<Integer> sum = list.stream()
                .filter(num -> num%2==0)
                .reduce(Integer::sum); //method reference
        if(sum.isPresent()){
            System.out.println(sum);
        }else{
            System.out.println("list is empty");
        }
    }
}
