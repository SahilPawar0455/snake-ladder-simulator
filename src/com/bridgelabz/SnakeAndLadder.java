package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator");
        int startingPosition = 0;
        System.out.println("Your Starting Position is " + startingPosition);
        int nowYourPosition = 0;
        int count = 0;
        while (nowYourPosition < 100) {
            int die = (int) (Math.random() * (6) + 1);
            System.out.println("Roll The Die to Get a Number is = " + die);
            int option = (int) (Math.random() * (3) + 1);
            count++;
            if ((option == 1) && ((nowYourPosition + die) <= 100)) {
                System.out.println("Your get Ladder");
                nowYourPosition = nowYourPosition + die;
            } else if (option == 2) {
                System.out.println("Your get snake");
                nowYourPosition = nowYourPosition - die;
                if (nowYourPosition < 0) {
                    nowYourPosition = 0;
                }
            } else {
                System.out.println("No play");
                nowYourPosition = nowYourPosition;
            }
            System.out.println("Now your Position is " + nowYourPosition +" Number of Time Dice are Played "+count);
        }
        System.out.println("You have Win The Game");
    }
}
