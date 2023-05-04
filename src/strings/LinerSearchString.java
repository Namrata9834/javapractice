package strings;

import java.util.Scanner;

public class LinerSearchString {
    public static void main(String[] args) {
        char ch[] = new char[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the characters");
        for (int i=0;i< ch.length;i++){
            ch[i]=  sc.next().charAt(0);
    }
        char ch1='a';
        for (int i=0;i< ch.length;i++){
            if(ch[i]==ch1){
                System.out.println("char element is found at index "+i);
            }
        }
}}