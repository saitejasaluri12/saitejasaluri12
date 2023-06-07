package com.java.week2;

public class arrayrotate {
    public static void main(String[] args) {
        int[] x = {2, 3, 6, 1, 46, 24, 87};
        int N = x.length;
        int shift = 3;
        for (int i = 0; i < N; i++)
        {
            if (i < N - shift)
            {
                System.out.println(x[i + shift]);
            }
        }
        for (int i = 0; i < shift; i++) {
            System.out.println(x[i]);
        }

    }
}


