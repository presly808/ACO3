package ua.artcode.week8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by admin on 23.12.2014.
 */
public class TestHashMap {

    public static void main(String[] args) {
        // new HashSet<User> <=> new HashMap<User, null>()
        Map<Integer, String> map = new HashMap<>();
        map.put(45, "Vania");
        map.put(1, "Kostia");
        map.put(9, "Misha");
        map.put(3, "Jack");
        map.put(2, "Bogdan");
        map.put(12, "Kolia");
        map.put(null, "Oleg");//overwrite

        System.out.println(map.get(45));
        System.out.println(map.get(12));

        System.out.println(map.isEmpty());

        String name = map.remove(12);

        System.out.println(map.size());

        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.printf("key=%s value=%s\n", key, value);
        }

        System.out.printf("***************************************\n");
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.printf("key=%s value=%s\n", entry.getKey(), entry.getValue());
        }


    }

}
