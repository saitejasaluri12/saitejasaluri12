package com.java.week1;

abstract public class Department
{

    public abstract int getDepartment();
}
class newdepartment extends Department
{

    public int Departmentsize;

    public  newdepartment(int size)
    {
        this.Departmentsize=size;
    }
    public int getDepartment()
    {
        return Departmentsize;
    }

    public static void main(String[] args)
    {
        Department d= new newdepartment(10);
        System.out.println(d.getDepartment());
    }


}
