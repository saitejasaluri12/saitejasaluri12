package com.java.week4.june19;

import java.util.ArrayList;

public class removelastobject {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add some objects to the ArrayList
        list.add("iphone");
        list.add("samsung");
        list.add("motorolla");

        System.out.println("ArrayList before removing the last object: " + list);

        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
            System.out.println("Last object removed successfully.");
        } else {
            System.out.println("ArrayList is empty. No objects to remove.");
        }

        System.out.println("ArrayList after removing the last object: " + list);
    }
}
