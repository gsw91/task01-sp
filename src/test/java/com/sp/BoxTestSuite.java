package com.sp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BoxTestSuite {

    @Test
    public void testCreateBoxOne() {
        //given
        Box box = new Box(2,3,4);
        //when
        double sideOne = box.getSideOne();
        double sideTwo = box.getSideTwo();
        double sideThree= box.getSideThree();
        double boxArea = box.getTotalArea();
        double smallestSide = box.getSmallestSide();
        //then
        Assert.assertEquals(sideOne, 6.00, 0.01);
        Assert.assertEquals(sideTwo, 12.00, 0.01);
        Assert.assertEquals(sideThree, 8.00, 0.01);
        Assert.assertEquals(boxArea, 52.00, 0.01);
        Assert.assertEquals(smallestSide, 6.00, 0.01);
    }

    @Test
    public void testCreateBoxTwo() {
        //given
        Box box = new Box(6,4,2.5);
        //when
        double sideOne = box.getSideOne();
        double sideTwo = box.getSideTwo();
        double sideThree= box.getSideThree();
        double boxArea = box.getTotalArea();
        double smallestSide = box.getSmallestSide();
        //then
        Assert.assertEquals(sideOne, 24.00, 0.01);
        Assert.assertEquals(sideTwo, 10.00, 0.01);
        Assert.assertEquals(sideThree, 15.00, 0.01);
        Assert.assertEquals(boxArea, 98.00, 0.01);
        Assert.assertEquals(smallestSide, 10.00, 0.01);
    }

}
