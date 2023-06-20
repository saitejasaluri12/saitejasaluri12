package com.java.week4.june19;

import java.util.ArrayList;

public class arrlisttoarr {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("sai");
        arrayList.add("rahul");
        arrayList.add("gowtham");

        String[] array = arrayList.toArray(new String[0]);

        System.out.println("Array elements:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
