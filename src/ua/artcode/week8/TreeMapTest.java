package ua.artcode.week8;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by admin on 23.12.2014.
 */
public class TreeMapTest {

    public static void main(String[] args) {
        Comparator<String> stringDescComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Map<String, int[]> map = new TreeMap<>(stringDescComparator);
        map.put("Oleh", new int[]{1,2,3});
        map.put("Ivan", new int[]{1,2,3});
        map.put("Mykola", new int[]{1,2,3});
        map.put("Yura", new int[]{1,2,3});
        map.put("Victor", new int[]{1,2,3});
        map.put("Nick", new int[]{1,2,3});

        for(String key : map.keySet()){
            System.out.println(key);
        }
    }

}
