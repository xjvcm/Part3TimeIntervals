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
        int firstStartHours, firstStartMinutes, firstStartTotalMinutes;
        int firstEndHours, firstEndMinutes, firstEndTotalMinutes;
        int secondStartHours, secondStartMinutes, secondStartTotalMinutes;
        int secondEndHours, secondEndMinutes, secondEndTotalMinutes;
        int firstStartHoursToMinutes, firstEndHoursToMinutes;
        int secondStartHoursToMinutes, secondEndHoursToMinutes;
        int temp; // Temp variable is declared to hold numbers for swap
        
        // Declare Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt User to input First Time Interval
        System.out.print("Enter earlier start and end time as two 24-hour "
            + "format times: ");
        firstIntervalStart = input.nextInt();
        firstIntervalEnd = input.nextInt();

        // Validate first interval inputs and swap if necessary
        if (firstIntervalStart > firstIntervalEnd) {
            temp = firstIntervalStart;
            firstIntervalStart = firstIntervalEnd;
            firstIntervalEnd = temp;

            // Debugging
            System.out.println(firstIntervalStart);
            System.out.println(firstIntervalEnd);
        }

        // Convert First Interval Start to Minutes
        firstStartHours = firstIntervalStart / 100;
        firstStartHoursToMinutes = firstStartHours * 60;
        firstStartMinutes = firstIntervalStart % 100;
        firstStartTotalMinutes = firstStartHoursToMinutes 
            + firstStartMinutes;

        // Convert First Interval End Minutes
        firstEndHours = firstIntervalEnd / 100;
        firstEndHoursToMinutes = firstEndHours * 60;
        firstEndMinutes = firstIntervalEnd % 100;
        firstEndTotalMinutes = firstEndHoursToMinutes + firstEndMinutes;

        // First Interval Total Time in Minutes
        firstTotalTime = firstEndTotalMinutes - firstStartTotalMinutes;

        // Prompt User to InputSecond Time Interval
        System.out.print("Enter later start and end time as two 24-hour "
            + "format times: ");
        secondIntervalStart = input.nextInt();
        secondIntervalEnd = input.nextInt();

        // Validate second interval inputs and swap if necessary
        if (secondIntervalStart > secondIntervalEnd) {
            temp = secondIntervalStart;
            secondIntervalStart =  secondIntervalEnd;
            secondIntervalEnd = temp;

            // Debugging
            System.out.println(secondIntervalStart);
            System.out.println(secondIntervalEnd);

        }

        // Convert Second Time Start to Minutes
        secondStartHours = secondIntervalStart / 100;
        secondStartHoursToMinutes = secondStartHours * 60;
        secondStartMinutes = secondIntervalStart % 100;
        secondStartTotalMinutes = secondStartHoursToMinutes 
            + secondStartMinutes;

        // Convert Second Time End to Minutes
        secondEndHours = secondIntervalEnd / 100;
        secondEndHoursToMinutes = secondEndHours * 60;
        secondEndMinutes = secondIntervalEnd % 100;
        secondEndTotalMinutes = secondEndHoursToMinutes 
            + secondEndMinutes;

        // Second Interval Total Time in Minutes
        secondTotalTime = secondEndTotalMinutes 
                - secondStartTotalMinutes;

        // Output Interval Times
        System.out.println("The earlier interval is " + firstTotalTime + 
            " minutes long.");
        System.out.println("The later interval is " + secondTotalTime + 
            " minutes long.");
        
        // Compare total times print which interval is longer
        if (firstTotalTime == secondTotalTime) {
            System.out.println("Both intervals are equally long.");
        }
        else if(firstTotalTime > secondTotalTime) {
            System.out.println("The eariler interval is longer.");
        }
        else {
            System.out.println("The later interval is longer.");
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