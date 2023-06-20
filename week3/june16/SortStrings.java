package com.java.week3.june16;
import java.util.Arrays;
import java.util.Comparator;

public class SortStrings {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date", "elephant", "fig", "grape"};
        sortStrings(strings);
        System.out.println(Arrays.toString(strings));
    }

    public static void sortStrings(String[] arr) {
        Arrays.sort(arr, Comparator.comparingInt(String::length).thenComparing(
                Comparator.comparing((String s) -> s.charAt(s.length() - 1)).reversed()));
    }
}

