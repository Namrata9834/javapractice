package collection_framework;

import java.util.HashSet;
// order is not preserved
// duplicates are not allowed
public class SetDemo {
    public static void main(String[] args) {
        HashSet<Double> nms = new HashSet<>();
        nms.add(16.90);
        nms.add(34.45678);
        nms.add(99.9);
        System.out.println(nms);
        nms.add(99.9);
    }
}
