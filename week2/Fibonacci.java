package com.java.week2;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int i=1,n=10, firstnum=0, secondnum=1;
        System.out.println("Fibonacci series upto "+n+" :");
        while(i<=num){
            System.out.print(firstnum+", ");
            int nextnum=firstnum+secondnum;
            firstnum=secondnum;
            secondnum=nextnum;
            i++;

        }
    }
}

