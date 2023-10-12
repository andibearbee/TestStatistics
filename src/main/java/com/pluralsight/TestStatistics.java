package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        int[] testScores = {63, 100, 65, 90, 53, 58, 37, 35, 70, 100};
        int sum = 0;
        int max = 0;

        for (int i = 0; i < testScores.length; i++) {
            sum = sum + testScores[i];
            if (testScores[i] > max) {
                max = testScores[i] > max;
            }
            System.out.println(testScores[i] + " sum: " + sum);
        }
        int average = sum / testScores.length;
            System.out.println(average);

    }
}
