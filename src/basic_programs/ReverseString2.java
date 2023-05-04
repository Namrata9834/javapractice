package basic_programs;

import java.util.Scanner;

public class ReverseString2 {
    public static void main(String[] args) {
//       char ch[]={'N','a','m','r','a','t','a'};
//       for (int i=ch.length-1;i>=0;i--){
//           System.out.print(ch[i]+" ");
    //}

        String str="Tati";
        String rev=" ";
        for (int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;
        }
        System.out.println(rev);
       }

}