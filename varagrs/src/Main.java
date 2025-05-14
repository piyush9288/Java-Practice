public class Main {
    public static void main(String... args) {
        System.out.print(sum1(2,3,5,4,6));
    }

    //varagrs : allow methods to accept any number of arguments.
    public static int sum1(int first,int second,int... a){
        int sum = first + second;
        for(int i : a){
            sum+=i;
        }
        return sum;
    }
}