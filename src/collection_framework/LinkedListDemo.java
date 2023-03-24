package collection_framework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("sayali");

        linkedList.add("aish");
        linkedList.add("sayali");
        linkedList.add("shraddha");
        linkedList.add("preeti");
        linkedList.add("namrata");
        linkedList.add("priyanka");
        linkedList.add("dakshta");
        linkedList.add("aishwarya");
        linkedList.add("pinky");
        linkedList.add(5,"vaishnavi");
        linkedList.addLast("nams");
        linkedList.getFirst();


        System.out.println(linkedList);

        System.out.println(linkedList);
        System.out.println("++++++++++++++++++++++++++++");
        linkedList.addLast("akanksha");
        System.out.println( linkedList.get(2));

//        Iterator<String> itr = linkedList.iterator();
//        while (itr.hasNext()){
//            String next = itr.next();

//            System.out.println(next);

        for (String str:linkedList)
              {
                  System.out.println(str);
        }
        }

    }

