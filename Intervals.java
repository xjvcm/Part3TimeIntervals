/*
    Jonathan Manzano
    
    Assignment: Selection Structures - Part 3: Time Intervals

    This program is to compare two time intervals.  It will prompt the user
    to input two time intervals in 24-hour format.  The user must provide a
    start and end time for both intervals.  It will calculate and print 
    how long each interval in minutes, which one is longer, and wheater the
    intervals overlap each other.
*/

import java.util.Scanner;

public class Intervals {
    public static void main(String[] args) {
        // Declare variables
        int firstIntervalStart, firstIntervalEnd, secondIntervalStart;
        int secondIntervalEnd, firstTotalTime, secondTotalTime;
        boolean does_overlap;
        
        // Declare Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt User
        System.out.println("Enter earlier start and end time as two " + 
            "24-hour format times.");
    }
}