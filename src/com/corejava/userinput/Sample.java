package com.corejava.userinput;
import java.util.Scanner;
public class Sample {
    public static void main(String []args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = kb.nextInt();
        System.out.println("Enter second number: ");
        int b = kb.nextInt();
        int s = a+b;
        System.out.println("Sum of "+a +" and "+ b +" is: "+ s);
    }
}