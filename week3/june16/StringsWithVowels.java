package com.java.week3.june16;

public class StringsWithVowels {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date"};
        printStringsWithVowels(strings);
    }

    public static void printStringsWithVowels(String[] arr) {
        for (String s : arr) {
            int vowelCount = countVowels(s);
            if (vowelCount > 0) {
                System.out.println(s + " (Vowels: " + vowelCount + ")");
            }
        }
    }

    public static int countVowels(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
