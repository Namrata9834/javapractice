package arrays;

import java.util.ArrayList;

public class EvenOdd2 {
    public static void main(String[] args) {
        int a[]={2,3,5,4,6,8,7,9,10};
        ArrayList<Integer> arrayList =  new ArrayList<>();
        ArrayList<Integer>arrayList1= new ArrayList<>();
        for (int i=0;i<a.length;i++){
            if(a[i]%2==0){
                arrayList.add(a[i]);
            } else {
                arrayList1.add(a[i]);
            }
        }
        System.out.println("even no's :");
        for (int no :arrayList){
            System.out.print(no+" ");
        }
        System.out.println();
        System.out.println("odd no's :");
        for (int no : arrayList1){
            System.out.print(no+" ");
        }


    }
}
