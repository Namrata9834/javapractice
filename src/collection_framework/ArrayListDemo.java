package collection_framework;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Namrata");
        arrayList.add("sayali");
        arrayList.add("Aish");
        arrayList.add("preeti");
        arrayList.add("shraddha");
        arrayList.add("priyanka");
        arrayList.add("dakshata");
        System.out.println(arrayList);
        arrayList.add(2,"pinky");
        System.out.println(arrayList);
        arrayList.isEmpty();
        arrayList.toArray();
        System.out.println(arrayList);

        arrayList.remove(3);
        System.out.println(arrayList);
        arrayList.size();
        System.out.println(arrayList);
        System.out.println( arrayList.indexOf("sayali"));
        System.out.println(arrayList.lastIndexOf("Namrata"));
    }
}
