import java.util.Scanner;

public class StringBuilderUse {
    public static void main(String[] args) {
        // Take an array of words and concatenate them into a single string
        //using StringBuilder.
        Scanner sc =  new Scanner(System.in);
        String[] str = new String[5];
        for(int i = 0;i<5;i++){
            System.out.print("Enter the name of fruit: ");
            str[i] = sc.nextLine();
        }
        StringBuilder sb = new StringBuilder();
        for(String put : str){
            sb.append(put);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
