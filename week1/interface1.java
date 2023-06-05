package com.java.week1;

interface assignment{
    public void school();
}
interface assignment2{
    public void univ();
}
class edu implements assignment,assignment2{
    public void school()
    {
        System.out.println("St Ann's High School");
    }
    public void univ()
    {
        System.out.println("North Texas");
    }
}
public class interface1{
    public static void main(String[] args){

        edu myedu= new edu();
        myedu.school();
        myedu.univ();
    }
}

