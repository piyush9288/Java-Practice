package in.challenges;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapUsing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> map = new HashMap<>();
        //Canada: Ottawa
        //Mexico: Mexico City
        //Russia: Moscow
        //China: Beijing
        //India: New Delhi
        map.put("Canada", "Ottawa");
        map.put("Mexico", "Mexico City");
        map.put("Russia", "Moscow");
        map.put("China", "Beijing");
        map.put("India", "New Delhi");
        boolean found = true;
        do {
            System.out.print("Enter the country name: ");
            String str = scanner.next();
            for (String key : map.keySet()) {
                if (key.equals(str)) {
                    System.out.printf("%s : %s\n", key, map.get(key));
                    found = false;
                    break;
                }
            }
            if (found) {
                System.out.println("this county is not allowed");
            }
//            if(str.equals("Exit")){
//                System.out.println("GoodBye!");
//                break;
//            }
        }while(found);
    }
}
