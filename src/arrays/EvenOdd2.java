package arrays;

import java.util.ArrayList;

public class EvenOdd2 {
    public static void main(String[] args) {
        int a[]={10,11,12,13,14};
       ArrayList<Integer > arrayList= new ArrayList<>();
       ArrayList<Integer> arrayList1=new ArrayList<>();
       for (int i=0;i<a.length;i++){
           if(a[i]%2==0){
               arrayList.add(a[i]);
           }
       }
        for (int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                arrayList1.add(a[i]);
            }
        }
        System.out.println("even no");
        for (int no:arrayList){
            System.out.print(no+" ");
        }
        System.out.println();

        System.out.println("odd no");
        for (int no1:arrayList1)
            System.out.print(no1+" ");


    }
}
