package collection_framework;

import java.util.TreeSet;
// follows ascending order and cannot contain duplicates
public class TreeDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(876);
        treeSet.add(876);
        treeSet.add(78);
        treeSet.add(8);
        treeSet.add(1000);
        System.out.println(treeSet);
    }
}
