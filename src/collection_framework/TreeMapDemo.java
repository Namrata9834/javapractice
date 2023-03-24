package collection_framework;

import java.util.TreeMap;
public class TreeMapDemo {
        public static void main(String[] args) {
            java.util.TreeMap<Integer,String> map = new java.util.TreeMap<>();
            map.put(105,"Maharashtra");
            map.put(103,"AP");
            map.put(104,"Goa");
            map.put(103,"Goa");
            map.put(106,null);
            // map.put(null,"Kerala");//thro' Null pointer ex
            System.out.println(map);
        }
    }



