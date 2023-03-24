package oops.polymorphism;

import java.util.Scanner;

/*
types : compiled time polymorphism ( is achieved within same class)
        Run time Polymorphism( is achieved  within different class)
 */
public class PolymorphismEx {
        void add(int a,int b){
            System.out.println("Addition= "+(a+b));
        }
        void add(int a,int b, int c){
            System.out.println("Addition "+(a+b+c));
        }

    public static void main(String[] args) {
        PolymorphismEx polymorphismEx = new PolymorphismEx();
        polymorphismEx.add(10,20,30);
        polymorphismEx.add(10,70);
    }
    }
