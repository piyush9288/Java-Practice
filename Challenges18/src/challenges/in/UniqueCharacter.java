package challenges.in;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {
    public static void uniqueCharacter(String str){
        Set<Character> uniqueCharacters = new HashSet<>();
        for(char st: str.toCharArray()){
            uniqueCharacters.add(st);
        }
        System.out.println(uniqueCharacters);
        System.out.println(uniqueCharacters.size());
    }
    public static void main(String[] args) {
        // Write a program that takes a string and returns the number of
        //unique characters using a Set.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        String str = scanner.next();
        uniqueCharacter(str);
    }
}
