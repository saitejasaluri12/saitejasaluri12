package com.java.week3.june12;

public class strint {
    public static void main(String[] args) {
        String[] sNumber={"32","15.75","test","428f"};
        int iNumber;
        try {
            for(String s:sNumber){
                iNumber= Integer.parseInt(s);
                System.out.println(iNumber);
            }
        }catch (NumberFormatException e){
            System.out.println("String Cannot converted as an Integer");
 }
}

}
