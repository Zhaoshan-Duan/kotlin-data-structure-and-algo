package javademo.collectiondemo.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 00000);

        empIds.get("Carl");

        System.out.println(empIds.containsKey("George"));
        System.out.println(empIds.containsValue(6));

        empIds.replace("John", 11111);
        empIds.put("John", 11111);

        empIds.putIfAbsent("Steve", 222);
        empIds.remove("John");

    }
}
