package com.pluralsight;

public class ScoreCheck {
    public static void main(String[] args) {
        int scores[] = {50, 23, 38, 98, 75, 63, 98, 81, 79, 43};
        int highScore = 0;
        int lowScore = scores[0];
        double avgScore = 0;

        for (int i = 0; i < 10; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
            } if (scores[i] < lowScore) {
                lowScore = scores[i];
            }
    }
        System.out.println("Highest score: " + highScore);
        System.out.println("Lowest score: " + lowScore);
        }
}
