package strings;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch[] =new char[10];
        System.out.println("enter ch characters");
        for (int i=0;i< ch.length;i++){
            ch[i]=sc.next().charAt(0);
        }
        System.out.println("characters : ");
        for (int i=0;i< ch.length;i++){
            System.out.print(ch[i]+" ");
        }








    }
}
