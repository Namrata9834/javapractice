package collection_framework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(50);
        set.add(90);
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.clone());
        System.out.println(set.size());

    }
}
