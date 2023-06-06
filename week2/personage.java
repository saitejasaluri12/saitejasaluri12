package com.java.week2;
import java.util.Scanner;
public class personage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        int age=sc.nextInt();
        if(age>=13&& age<=19) {
            System.out.println("Teen age");
        }
            else if(age<13){
                System.out.println("kid");
            }
            else{
                System.out.println("adullt");
        }
    }
}
