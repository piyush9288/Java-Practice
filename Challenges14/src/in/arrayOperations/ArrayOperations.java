package in.arrayOperations;

public class ArrayOperations {
    //Create a class ArrayOperations with a static nested class Statistics.
    //Statistics could have methods like mean(), median(), which
    //operate on an array
    private int[] array;
//    public ArrayOperations(int[] array){
//        this.array = array;
//    }
    public void setArray(int[] array){
        this.array = array;
    }
    public static class Statistics{
        public static double mean(int[] arr){
            int sum = 0;
            for(int ar : arr){
                sum += ar;
            }
            return (double) sum/arr.length;
        }
        public static double median(){
            return 0;
        }
    }
    public double getArray(){
        return Statistics.mean(array);
    }
}
