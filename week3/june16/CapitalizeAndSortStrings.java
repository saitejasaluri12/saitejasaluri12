package com.java.week3.june16;

import java.util.Arrays;

public class CapitalizeAndSortStrings {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date"};
        capitalizeAndSortStrings(strings);
    }

    public static void capitalizeAndSortStrings(String[] arr) {
        String[] capitalizedStrings = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String capitalized = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
            capitalizedStrings[i] = capitalized;
        }

        Arrays.sort(capitalizedStrings);

        for (String s : capitalizedStrings) {
            System.out.println(s);
        }
    }
}
