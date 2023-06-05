package com.java.week1;

public class product {
    double price;

    //public double getPrice() {
    //   return price;
    //}

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice(int quality){
        return price*quality;

    }
    public static void main(String args[]){
        product n =new product();
        n.setPrice(200);
        double totalprice =  n.getPrice(20);
        System.out.println("totalprice="+ totalprice);
}

}
