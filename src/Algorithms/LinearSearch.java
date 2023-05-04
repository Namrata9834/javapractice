package Algorithms;

public class LinearSearch {
    public static void main(String[] args) {
       int array[]={1,4,6,7,9,20};
      int item=6;
      for (int i=0;i< array.length;i++){
          if(array[i]==item){
              System.out.println("element "+array[i]+" is found at "+i+" index");
           }
       }
    }

}
