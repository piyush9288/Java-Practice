import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(" ");
                if(n-1-i<=j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}