package in.arrayOperations;

public class AccessArrayOperations {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayOperations aro = new ArrayOperations();
        aro.setArray(arr);
        System.out.println(aro.getArray());
    }
}
