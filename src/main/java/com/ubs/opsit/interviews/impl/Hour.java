package com.ubs.opsit.interviews.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajneet on 5/6/2018.
 */
public class Hour {

    private static final int HOUR_ROW1 = 2;
    private static final int HOUR_ROW2 = 3;
    private static final int HOUR_ROW1_TIME_UNIT = 5;
    private static final int HOUR_ROW1_NUM_OF_LAMPS=4;
    private static final int HOUR_ROW2_TIME_UNIT = 1;
    private static final int HOUR_ROW2_NUM_OF_LAMPS=4;
    private final Row row1;
    private final Row row2;


    public Hour(){
        this.row1 = new Row(HOUR_ROW1,HOUR_ROW1_TIME_UNIT,HOUR_ROW1_NUM_OF_LAMPS);
        this.row2 = new Row(HOUR_ROW2,HOUR_ROW2_TIME_UNIT,HOUR_ROW2_NUM_OF_LAMPS);
    }

    public String setTime(int hour){
        int remainder = 0;
        if(hour > HOUR_ROW1_TIME_UNIT){
            this.row1.setLampsToLight("R", hour/HOUR_ROW1_TIME_UNIT);
            remainder = hour % HOUR_ROW1_TIME_UNIT;
        }else{
            this.row2.setLampsToLight("R", hour%HOUR_ROW1_TIME_UNIT);
        }
        this.row2.setLampsToLight("R", remainder);

        StringBuilder builder = new StringBuilder();
        for(Lamp lamp : this.row1.getLamps()){
            builder.append(lamp.getColor());
        }
        builder.append(System.getProperty("line.separator"));

        for(Lamp lamp : this.row2.getLamps()){
            builder.append(lamp.getColor());
        }

        return builder.toString();
    }
}
