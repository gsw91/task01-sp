package com.sp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(JUnit4.class)
public class WrappingCalculationTestSuite {

    @Test
    public void testCalculateBoxesAreaToWrap() {
        //given
        WrappingCalculation calculation = new WrappingCalculation();

        Box boxOne = new Box(2,3,4);
        Box boxTwo = new Box(6,4,2.5);

        List<Box> boxList = new ArrayList<>();
        boxList.add(boxOne);
        boxList.add(boxTwo);
        //when
        BigDecimal result = calculation.calculateBoxesAreaToWrap(boxList);
        //then
        Assert.assertEquals(BigDecimal.valueOf(166.00),  result);
    }

}
