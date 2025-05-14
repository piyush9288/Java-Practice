import java.util.List;
import java.util.function.BinaryOperator;

public class SumUsingReduceMethod {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,5,4,6);
        //stream() with reduce
        int sum = list.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer+integer2;
                    }
                });
        System.out.printf("Sum: %d",sum);

        //stream with reduce and lambda
        int sum2 = list.stream()
                .reduce(0, (a,b)-> a+b);
        System.out.printf("\nSum->: %d",sum2);

        //stream with reduce and lambda and ternary operator
        int max = list.stream()
                .reduce(Integer.MIN_VALUE, (a,b)-> a>b?a:b);
        System.out.printf("\nmax->: %d",max);
    }
}
