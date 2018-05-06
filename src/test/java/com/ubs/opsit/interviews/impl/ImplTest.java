package com.ubs.opsit.interviews.impl;

import com.sun.org.apache.xerces.internal.parsers.SecurityConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by Rajneet on 5/7/2018.
 */

@RunWith(MockitoJUnitRunner.class)
public class ImplTest {

    @Mock
    Hour hour;

    @Mock
    Minute minute;

    @Mock
    Second sec;

    @Test
    public void testHourClass(){
        Mockito.when(hour.setTime(15)).thenReturn("RRRO"+System.getProperty("line.separator")+"OOOO");
        Mockito.when(hour.setTime(23)).thenReturn("RRRR"+System.getProperty("line.separator")+"RRRO");
        Mockito.when(hour.setTime(3)).thenReturn("OOOO"+System.getProperty("line.separator")+"RRRO");
        Mockito.when(hour.setTime(7)).thenReturn("ROOO"+System.getProperty("line.separator")+"RROO");
    }


    @Test
    public void testMinuteClass(){
        Mockito.when(minute.setTime(6)).thenReturn("YOOOOOOOOOO"+System.getProperty("line.separator")+"YOOO");
        Mockito.when(minute.setTime(20)).thenReturn("YYRYOOOOOOO"+System.getProperty("line.separator")+"OOOO");
        Mockito.when(minute.setTime(37)).thenReturn("YYRYYRYOOOO"+System.getProperty("line.separator")+"YYOO");
        Mockito.when(minute.setTime(59)).thenReturn("YYRYYRYYRYY"+System.getProperty("line.separator")+"YYYY");
    }


    @Test
    public void testSecondClass(){
        Mockito.when(sec.setTime(5)).thenReturn("O");
        Mockito.when(sec.setTime(26)).thenReturn("Y");
        Mockito.when(sec.setTime(39)).thenReturn("O");
        Mockito.when(sec.setTime(55)).thenReturn("O");
        Mockito.when(sec.setTime(4)).thenReturn("Y");
    }

}
