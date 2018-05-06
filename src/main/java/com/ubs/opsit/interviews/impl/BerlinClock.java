package com.ubs.opsit.interviews.impl;

import com.ubs.opsit.interviews.TimeConverter;

/**
 * Created by Rajneet on 5/6/2018.
 */
public class BerlinClock implements TimeConverter {

    private final Hour hour;
    private final Minute minute;
    private final Second second;

    public BerlinClock(){
        this.hour = new Hour();
        this.minute = new Minute();
        this.second = new Second();
    }

    @Override
    public String convertTime(String aTime) {

        if(aTime != null) {
            String[] arrTime = aTime.split(":");
            String secStr = this.second.setTime(Integer.parseInt(arrTime[2]));
            String minStr = this.minute.setTime(Integer.parseInt(arrTime[1]));
            String hourStr = this.hour.setTime(Integer.parseInt(arrTime[0]));

            StringBuilder builder = new StringBuilder(secStr);
            builder.append(System.getProperty("line.separator"));
            builder.append(hourStr);
            builder.append(System.getProperty("line.separator"));
            builder.append(minStr);

            System.out.println(builder.toString());
            return builder.toString();
        }else{
            System.out.println("Please enter a valid time in HH:MM:SS format");
            return "Please enter a valid time in HH:MM:SS format";
        }
    }

}
