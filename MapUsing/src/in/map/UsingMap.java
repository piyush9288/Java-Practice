package in.map;

import java.util.HashMap;
import java.util.Map;

public class UsingMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Apple",100);
        map.put("Mango",50);
        map.put("PineApple",200);
        map.put("Guava",10);
        System.out.println(map.size());
        System.out.println(map.get("Mango"));
        System.out.println(map.containsKey("Apple"));
        System.out.println(map.remove("Guava"));
        System.out.println(map.size());
        System.out.println(map.values());
        for(String key: map.keySet()){
            System.out.printf("%s : %s\n", key, map.get(key));
        }
    }
}
