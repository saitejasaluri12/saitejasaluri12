package com.java.week1;

class first{
   int x;
}
class second extends first {
    int y;

    second(int x, int y) {
        this.x = x;
        this.y = y;
    }

    second(int y) {

        this.y = y;
    }
}
public class fourth2 {
    public static void main(String args[]) {
        second obj = new second(5);
        second obj1 = new second(10, 5);
        int a = obj.x;
        int b = obj.y;
        int c = obj1.x;
        int d = obj1.y;
        System.out.println(a+" "+b+" "+c+" "+d);
}
}
