package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator");
        int startingPosition = 0;
        System.out.println("Your Starting Position is " + startingPosition);
        int die = (int) (Math.random() * (6) + 1);
        System.out.println("Roll The Die to Get a Number is = " + die);
    }
}
