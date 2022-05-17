package com.data;

import java.util.Scanner;

/*
    Poland:
    Summer Time (CEST) -> GMT +2
    Winter Time (CET) -> GMT +1
    https://www.worldtimebuddy.com/
 */
public class Data4 {
    public static void data() {
        System.out.print("Please input GMT timezone: ");
        Scanner sc = new Scanner(System.in);
        int zone = sc.nextInt();
        System.out.println();
        //Taking current time in millis
        long totalMili = System.currentTimeMillis();
        //Convert to seconds
        long totalSec = totalMili / 1000;
        long currentSec = totalSec % 60;
        //Convert sec to minutes
        long totalMin = totalSec / 60;
        long currentMin = totalMin % 60;
        //Convert min to hours
        long totalHour = totalMin / 60;
        long currentHour = (totalHour + zone) % 24;

        System.out.println(currentHour + ":" + currentMin + ":" + currentSec);
    }
}
