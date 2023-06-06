package com.java.week2;

public class reverse {
    public static void main(String[] args){
        int num=123456, rev=0;
        while(num!=0)
        {
            int digit =num%10;
            rev=rev*10+digit;
            num/=10;

        }
        System.out.println(rev);

    }
}
