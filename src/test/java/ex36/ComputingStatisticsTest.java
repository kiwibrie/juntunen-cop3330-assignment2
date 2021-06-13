package ex36;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ComputingStatisticsTest {
    ComputingStatistics app = new ComputingStatistics();

    ArrayList<Double> al = new ArrayList<>();

    @Test
    public void averageTest(){
        al.add(100.0); al.add(200.0); al.add(1000.0); al.add(300.0);
        assertEquals(400.0, app.average(al));
    }

    @Test
    public void minimumTest(){
        al.add(100.0); al.add(200.0); al.add(1000.0); al.add(300.0);
        assertEquals(100, app.min(al));
    }
    @Test
    public void minimumTest2(){
        al.add(-1.0); al.add(0.0); al.add(1.0); al.add(-1.1);
        assertEquals(-1.1, app.min(al));
    }

    @Test
    public void maximumTest(){
        al.add(100.0); al.add(200.0); al.add(1000.0); al.add(300.0);
        assertEquals(1000, app.max(al));
    }
    @Test
    public void maximumTest2(){
        al.add(0.0); al.add(1000.0); al.add(1000.0); al.add(1000.1);
        assertEquals(1000.1, app.max(al));
    }

    @Test
    public void stdTest(){
        al.add(100.0); al.add(200.0); al.add(1000.0); al.add(300.0);
        assertEquals(353.55, app.std(al, app.average(al)));
    }
}