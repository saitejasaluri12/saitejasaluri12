package com.java.week3.june12;

class CustE extends RuntimeException{
    CustE(String s){
        super(s);
    }
}
public class Customexception {
    public static void main(String[] args) {
        int x;
        try {
            x = 10 / 0;
            System.out.println(x);
        } catch (RuntimeException e) {
            throw new CustE("This is our customized Exception");
        }
    }
}

