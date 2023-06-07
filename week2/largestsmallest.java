package com.java.week2;

public class largestsmallest {

        public static void main(String[] args) {
            int[] x={3,6,24,45,54,65,78};
            int largenum=x[0];
            int smallnum=x[0];
            for(int i=0;i<=x.length-1;i++){
                int constant=x[i];
                if(constant>largenum)
                    largenum=constant;
                if(constant<smallnum)
                    smallnum=constant;
            }
            System.out.println("largest:"+largenum);
            System.out.println("smallest:"+smallnum);


    }
}
