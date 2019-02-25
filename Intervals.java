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

        // First Time Interval
        System.out.print("Enter earlier start and end time as two 24-hour format times: ");
        firstIntervalStart = input.nextInt();
        firstIntervalEnd = input.nextInt();

        // Second Time Interval
        System.out.print("Second time interval start: ");
        secondIntervalStart = input.nextInt();
        System.out.print("Second time interval end: ");
        secondIntervalEnd = input.nextInt();

        // Calculate First Time Interval
        firstTotalTime = firstIntervalEnd - firstIntervalStart;
        System.out.println("The earlier interval is " + firstTotalTime + 
            " minutes long.");
        
        // Calculate Second Time Interval
        secondTotalTime = secondIntervalEnd - secondIntervalStart;
        System.out.println("The later interval is " + secondTotalTime + 
            " minutes long.");
        
        // Compare total times print which interval is longer
        if (firstTotalTime == secondTotalTime) {
            System.out.println("Both intervals are the same duration");
        }
        else if(firstTotalTime > secondTotalTime) {
            System.out.println("The first interval is longer");
        }
        else {
            System.out.println("The second interval is longer");
        }

        // Determine if the intervals overlap
        if (firstIntervalStart <= secondIntervalEnd 
            && secondIntervalStart <= firstIntervalEnd) {
            System.out.println("These intervals overlap.");
        }
        else {
            System.out.println("These intervals do not overlap.");
        }
    }
}