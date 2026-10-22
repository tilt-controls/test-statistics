package com.pluralsight;

public class ScoreCheck {
    public static void main(String[] args) {
        int scores[] = {50, 23, 38, 98, 75, 63, 98, 81, 79, 43};
        int highScore = 0;
        int lowScore = scores[0];
        int sum = 0;
        double avgScore = 0;

        for (int i = 0; i < 10; i++) {
            if (scores[i] > highScore) { // if element is higher it will reassign high score
                highScore = scores[i];
            } if (scores[i] < lowScore) { // if element is lower it will reassign low score
                lowScore = scores[i];
            } sum += scores[i];
    }
        avgScore = sum / scores.length; // find average

        System.out.println();
        System.out.println("Highest score: " + highScore);
        System.out.println("Lowest score: " + lowScore);
        System.out.println("Average: " + avgScore);
        }
}
