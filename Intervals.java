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
        // Declare constant
        final int MINS_IN_HOUR = 60;

        // Declare variables
        int x1, x2, y1, y2;
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
            + "format times(XXXX XXXX *Use SPACE to seperate times*): ");
        x1 = input.nextInt();
        x2 = input.nextInt();

        // Valid if input is within 0000 - 2400
        while (x1 < 0 || x1 > 2400) {
            System.out.print(x1 + " is an invalid start time.  Please " + 
                "time within 0000 - 2400: ");
            x1 = input.nextInt();
            
            // Debug
            // System.out.println(x1 + " is valid");
        }

        // Valid if input is within 0000 - 2400
        while (x2 < 0 || x2 > 2400) {
            System.out.print(x2 + " is an invalid end time.  Please " + 
                "time within 0000 - 2400: ");
            x2 = input.nextInt();
            
            // Debug
            // System.out.println(x2 + " is valid");
        }
        
        // Prompt User to InputSecond Time Interval
        System.out.print("Enter later start and end time as two 24-hour "
        + "format times(XXXX XXXX *Use SPACE to seperate times*): ");
        y1 = input.nextInt();
        y2 = input.nextInt();

        // Valid if input is within 0000 - 2400
        while (y1 < 0 || y1 > 2400) {
            System.out.print(y1 + " is an invalid start time.  Please " + 
                "time within 0000 - 2400: ");
            y1 = input.nextInt();
            
            // Debug
            // System.out.println(y1 + " is valid");
        }

        // // Valid if input is within 0000 - 2400
        while (y2 < 0 || y2 > 2400) {
            System.out.print(y2 + " is an invalid end time.  Please " + 
                "time within 0000 - 2400: ");
            y2 = input.nextInt();
            
            // Debug
            System.out.println(y2 + " is valid");
        }
        
        
        // Validate first interval inputs and swap if necessary
        if (x1 > x2) {
            temp = x1;
            x1 = x2;
            x2 = temp;

            // Debugging
            System.out.println(x1 + " this is first start");
            System.out.println(x2 + " this is first end");
        }
        
        // Validate second interval inputs and swap if necessary
        if (y1 > y2) {
            temp = y1;
            y1 =  y2;
            y2 = temp;
            
            // Debugging
            // System.out.println(y1 + " this is second start");
            // System.out.println(y2 + " this is second end");
            
        }
        
        // Check and validate if they user inputed the time intervals in 
        // correct order
        if (x1 > y1) {
            secondIntervalStart = x1;
            secondIntervalEnd = x2;
            firstIntervalStart = y1;
            firstIntervalEnd = y2;

            // Debug
        //     System.out.println(firstIntervalStart + " this is first start");
        //     System.out.println(firstIntervalEnd + " this is first end");
        //     System.out.println(secondIntervalStart + " this is second start");
        //     System.out.println(secondIntervalEnd + " this is second end");
        } else {
            firstIntervalStart = x1;
            firstIntervalEnd = x2;
            secondIntervalStart = y1;
            secondIntervalEnd = y2;

            // Debug
            // System.out.println(firstIntervalStart);
            // System.out.println(firstIntervalEnd);
            // System.out.println(secondIntervalStart);
            // System.out.println(secondIntervalEnd);
        }



        // Convert First Interval Start to Minutes
        firstStartHours = firstIntervalStart / 100;
        firstStartHoursToMinutes = firstStartHours * MINS_IN_HOUR;
        firstStartMinutes = firstIntervalStart % 100;
        firstStartTotalMinutes = firstStartHoursToMinutes 
            + firstStartMinutes;
        
        // Convert First Interval End Minutes
        firstEndHours = firstIntervalEnd / 100;
        firstEndHoursToMinutes = firstEndHours * MINS_IN_HOUR;
        firstEndMinutes = firstIntervalEnd % 100;
        firstEndTotalMinutes = firstEndHoursToMinutes + firstEndMinutes;
        
        // First Interval Total Time in Minutes
        firstTotalTime = firstEndTotalMinutes - firstStartTotalMinutes;

        // Convert Second Time Start to Minutes
        secondStartHours = secondIntervalStart / 100;
        secondStartHoursToMinutes = secondStartHours * MINS_IN_HOUR;
        secondStartMinutes = secondIntervalStart % 100;
        secondStartTotalMinutes = secondStartHoursToMinutes 
            + secondStartMinutes;

        // Convert Second Time End to Minutes
        secondEndHours = secondIntervalEnd / 100;
        secondEndHoursToMinutes = secondEndHours * MINS_IN_HOUR;
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