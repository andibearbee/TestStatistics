package com.pluralsight;

public class TestStatistics {
    //method
    public static void main(String[] args) {
        //array of 10 test scores
        int[] testScores = {63, 100, 65, 90, 53, 58, 37, 35, 70, 42};
        //defining variables to invoke later
        int sum = 0;
        int max = 0;
        int min = 999;
        double average = 0.0;
        // for loop needs a condition and equations to give result
        for (int i = 0; i < testScores.length; i++) {
            //looking for highest value
            if (testScores[i] > max) {
                max = testScores[i];
            }
            if (testScores[i] < min) {
                min = testScores [i];
            }
            sum = sum + testScores[i];
            System.out.println(testScores[i] + " sum: " + sum);
        }

        average = sum / testScores.length;
        System.out.println("Average: " + average);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);



    }
}
