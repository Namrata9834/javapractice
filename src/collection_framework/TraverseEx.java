package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;

public class TraverseEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Namrata");
        arrayList.add("sayali");
        arrayList.add("preeti");
        arrayList.add("shraddha");
        arrayList.add("priyanka");
        arrayList.add("dakshta");

        // for each loop
        for(String str: arrayList ){
            System.out.println(str+" "+str.length());
        }
        System.out.println("++++++++++++++++++++++++++++");


        // traversing using Iterator
        Iterator<String> itr=arrayList.iterator();
            while (itr.hasNext()){
                String str = itr.next();
                System.out.println(str);

            }
        System.out.println("++++++++++++++++++++++++++");

            //Enumeration (vector and stack)
        arrayList.forEach(e->{                  // lambda function
            System.out.println(e);
        });
        }

    }

