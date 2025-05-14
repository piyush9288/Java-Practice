import org.w3c.dom.ls.LSOutput;

public class PalindromeNumber {
    public static void main(String[] args) {
        //Create a program using recursion to check if a string is a palindrome using recursion.
        int num = Main.input();
        boolean pal = isPalindrome(num);
        System.out.println("This " + num + " is palindrome: " + pal);

    }
    public static int reverse(int num, int rev){
        if(num == 0){
            return rev;
        }
        return reverse(num/10,rev*10+num%10);
    }
    public static boolean isPalindrome(int num){
        if(num< 0 ){
            return false;
        }
        return num == reverse(num,0);

    }
}
