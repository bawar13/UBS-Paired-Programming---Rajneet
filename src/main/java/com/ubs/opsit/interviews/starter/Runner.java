package com.ubs.opsit.interviews.starter;

import com.ubs.opsit.interviews.impl.BerlinClock;

/**
 * Created by Rajneet on 5/6/2018.
 */
public class Runner {

    public static void main(String[] args) {
        BerlinClock clock = new BerlinClock();
        clock.convertTime("23:59:59");  // Sample run
    }
}
