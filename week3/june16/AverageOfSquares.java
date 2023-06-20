package com.java.week3.june16;

public class AverageOfSquares {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double average = calculateAverageOfOddSquares(numbers);
        System.out.println("Average of squares of odd numbers: " + average);
    }

    public static double calculateAverageOfOddSquares(int[] arr) {
        int count = 0;
        int sum = 0;

        for (int num : arr) {
            if (num % 2 != 0) { // Check if number is odd
                int square = num * num;
                sum += square;
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return (double) sum / count;
    }
}
