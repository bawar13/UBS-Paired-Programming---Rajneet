package com.ubs.opsit.interviews.impl;

import java.util.ArrayList;

/**
 * Created by Rajneet on 5/6/2018.
 */
public class Minute {

    private static final int MIN_ROW1 = 4;
    private static final int MIN_ROW2 = 5;
    private static final int MIN_ROW1_TIME_UNIT = 5;
    private static final int MIN_ROW1_NUM_OF_LAMPS=11;
    private static final int MIN_ROW2_TIME_UNIT = 1;
    private static final int MIN_ROW2_NUM_OF_LAMPS=4;
    private final Row row1;
    private final Row row2;


    public Minute(){
        this.row1 = new Row(MIN_ROW1,MIN_ROW1_TIME_UNIT, MIN_ROW1_NUM_OF_LAMPS);
        this.row2 = new Row(MIN_ROW2,MIN_ROW2_TIME_UNIT, MIN_ROW2_NUM_OF_LAMPS);
    }

    public String setTime(int minute){
        int remainder = 0;
        if(minute > MIN_ROW1_TIME_UNIT){
            this.row1.setLampsToLight("Y", minute/MIN_ROW1_TIME_UNIT);
            remainder = minute % MIN_ROW1_TIME_UNIT;
        }else{
            this.row2.setLampsToLight("Y", minute%MIN_ROW1_TIME_UNIT);
        }
        this.row2.setLampsToLight("Y", remainder);

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
