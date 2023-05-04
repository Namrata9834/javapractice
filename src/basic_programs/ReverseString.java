package basic_programs;

import static jdk.nashorn.internal.objects.NativeString.charAt;

public class ReverseString {
    public static void main(String[] args) {
       String str="Sangeeta";
       String rev=" ";
       for (int i=0;i<str.length();i++){
           rev=str.charAt(i)+rev;
       }
        System.out.println(rev);
    }
}
