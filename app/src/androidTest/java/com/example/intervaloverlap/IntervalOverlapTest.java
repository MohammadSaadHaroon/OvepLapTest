package com.example.intervaloverlap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IntervalOverlapTest {
    IntervalOverlap SUT;
    @Before
    public void OverlapVal(){
        SUT = new IntervalOverlap();
    }
    @Test
    public void OverlapTest(){
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(8, 12);
        boolean result = SUT.isOverlap(interval1,interval2);
        Assert.assertThat(result,is(false));
    }

    @Test
    public void OverlapTest2(){
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-4, 4);
        boolean result = SUT.isOverlap(interval1,interval2);
        Assert.assertThat(result,is(true));
    }

    @Test
    public void OverlapTest3(){
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-10, -3);
        boolean result = SUT.isOverlap(interval1,interval2);
        Assert.assertThat(result,is(false));
    }

    @Test
    public void OverlapTest4(){
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-4, 12);
        boolean result = SUT.isOverlap(interval1,interval2);
        Assert.assertThat(result,is(true));
    }

}