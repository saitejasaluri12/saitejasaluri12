package com.java.week1;
class bikes{
    float price()
    {
        return 5200f;
    }
}
class harley extends bikes{
    float price()
    {
        return 4500f;
    }
}
class honda extends bikes{
    float price()
    {
        return 6700f;
    }
}
class bmw extends bikes{
    float price()
    {
        return 8200f;
    }
}
public class bike {
    public static void main(String args[]){
        bikes eng=new harley();
        System.out.println("harley price: "+eng.price());
        eng=new honda();
        System.out.println("honda pricet: "+eng.price());
        eng=new bmw();
        System.out.println("bmw price: "+eng.price());
    }

}
