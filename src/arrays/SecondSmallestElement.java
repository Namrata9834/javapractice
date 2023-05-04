package arrays;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int array[]={19,52,190,67,89,98,15};
        int temp;
          for (int i=0;i< array.length;i++){
              for (int j=i+1;j< array.length;j++){
                  if(array[i]>array[j]){
                      temp=array[i];
                      array[i]=array[j];
                      array[j]=temp;
                  }
              }
          }
        System.out.println("sorted elements of array");
          for (int i=0;i< array.length;i++){
              System.out.print(array[i]+" ");
          }
        System.out.println();
        System.out.println("second smallest element of array "+array[1]);


        }
    }

