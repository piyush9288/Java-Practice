public class Main {
    public static void main(String[] args) {
        IntPredicate isPrime = (int number) -> {
            if(number<=1){ return false;}
            for(int i = 2;i<=Math.sqrt(number);i++){
                if(number%i==0){ return false;}
            }
            return true;
        };

        int[] testNumber = {1,2,3,4,5,6,7,8};

        for(int num : testNumber){
            System.out.println(num + " isPrime? " + isPrime.test(num));
        }
    }
}