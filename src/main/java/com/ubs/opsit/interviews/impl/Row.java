package com.ubs.opsit.interviews.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajneet on 5/6/2018.
 */
public class Row{

    private int rowNumber;
    private int timeUnit;
    private List<Lamp> lamps;
    private int numOfLamps;

    public Row(int rowNumber, int timeUnit, int numOfLamps) {
        this.rowNumber = rowNumber;
        this.timeUnit = timeUnit;
        this.lamps = new ArrayList<Lamp>();
        this.numOfLamps = numOfLamps;
        initialize();
    }

    private void initialize(){
        for(int i=0; i<numOfLamps;i++){
            this.lamps.add(new Lamp());
        }
    }
    public void setLampsToLight( String color, int noOfLamps){

        if(noOfLamps > 0) {
            for (int i=0; i<noOfLamps; i++) {
                if (this.rowNumber == 4 && (i+1)%3 == 0) {          // Every quarter of time should be represented with a Red light in Minutes Row
                    (this.lamps.get(i)).setColor("R");
                } else {
                    (this.lamps.get(i)).setColor(color);
                }
            }
        }
    }


    public List<Lamp> getLamps(){
        return this.lamps;
    }
}
