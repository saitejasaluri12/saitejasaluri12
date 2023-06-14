package com.java.week3.june13;

class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
public class UseThread {
    public static void main(String[] args) {
        Thread1 r=new Thread1();
        Thread t=new Thread(r);
        t.start();
}
}