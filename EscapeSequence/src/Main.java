import java.lang.*;
public class Main {
    public static void main(String[] args) {
        // insert a tab
        String s1 = "Hello\tWorld";
        // insert a backspace
        String s2 = "Hello\b World";
        // insert a new line
        String s3 = "Hello\nWorld";
        // insert a single quote character
        String s4 = "Hello \'World\'";
        // insert a double quote character
        String s5 = "Hello \"World\"";
        // insert a backslash character
        String s6 = "Hello \\World\\";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}