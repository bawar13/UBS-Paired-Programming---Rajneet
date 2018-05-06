package com.ubs.opsit.interviews.impl;

import java.util.ArrayList;

/**
 * Created by Rajneet on 5/6/2018.
 */
public class Second{

    private static final int SEC_ROW = 1;
    private static final int SEC_ROW1_NUM_OF_LAMPS=1;
    private final Row row1;


    public Second(){
        this.row1 = new Row(SEC_ROW,1, SEC_ROW1_NUM_OF_LAMPS);
    }

    public String setTime(int second){

        if(second%2==0){
            this.row1.setLampsToLight("Y", 1);
        }

        StringBuilder builder = new StringBuilder();
        for(Lamp lamp : this.row1.getLamps()){
            builder.append(lamp.getColor());
        }

        return builder.toString();
    }
}
