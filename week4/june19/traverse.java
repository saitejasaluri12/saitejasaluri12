package com.java.week4.june19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class traverse {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("samsung");
        arrayList.add("google");

        // for loop
        System.out.println("Traversing ArrayList using a for loop:");
        for (int i = 0; i < arrayList.size(); i++) {
            String element = arrayList.get(i);
            System.out.println(element);
        }

        // enhanced for loop
        System.out.println("\nTraversing ArrayList using an enhanced for loop:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        // iterator
        System.out.println("\nTraversing ArrayList using an iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // forEach method
        System.out.println("\nTraversing ArrayList using forEach method:");
        arrayList.forEach(System.out::println);

        // parallel Stream
        System.out.println("\nTraversing ArrayList using parallel Stream:");
        Stream<String> stream = arrayList.parallelStream();
        stream.forEach(System.out::println);
    }
}
