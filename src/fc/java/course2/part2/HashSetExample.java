package fc.java.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // 중복X

        System.out.println(set.size());

        for(String element:set) {
            System.out.println(element);
        }

        set.remove("Banana");

        for(String element:set) {
            System.out.println(element);
        }

        boolean contains= set.contains("Cherry");
        System.out.println("set contains Cherry?" + contains );

        set.clear();

        boolean empty = set.isEmpty();
        System.out.println(empty);
    }
}
