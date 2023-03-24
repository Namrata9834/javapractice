package collection_framework;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap= new HashMap<>();
        hashMap.put(1,"NKOCET");
        hashMap.put(2,"Singhgad");
        hashMap.put(3,"VVp");
        hashMap.put(4,"svit");
        hashMap.put(5,"pvpit");
        hashMap.put(6,"tissm");
        hashMap.put(7,"mit");
        System.out.println(hashMap);
        System.out.println(hashMap.isEmpty());
        hashMap.remove(4);
        System.out.println(hashMap);
        
        hashMap.replace(6,"tissm");
        System.out.println(hashMap);
        System.out.println(hashMap.containsKey(10));
        System.out.println( hashMap.containsKey(5));
        System.out.println(hashMap.get(7));


    }
}
