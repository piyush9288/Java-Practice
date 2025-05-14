import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the two number: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        try{
            int[] arr = new int[5];

            //arr[6] = first / second;
            //System.out.println(arr[6]);
            System.out.println(first/second);
        }catch (ArithmeticException exception){
            System.out.printf("%s , is the exception",exception.getMessage());
        }
//        catch (ArrayIndexOutOfBoundsException exception){
//            System.out.printf("%s , is the exception",exception.getMessage());
//        }
        catch (Throwable th){
            System.out.printf("%s , is the exception",th.getMessage());
            throw th;
        }
        finally{
            System.out.println("it is finally");
        }
    }
}