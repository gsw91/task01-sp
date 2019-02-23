package com.sp;

import java.math.BigDecimal;
import java.util.List;

public final class WrappingCalculation {

    private double calculateBoxAreaToWrap(Box box) {
        return box.getTotalArea()+box.getSmallestSide();
    }

    public BigDecimal calculateBoxesAreaToWrap(List<Box> boxList) {
        BigDecimal areaToWrap = BigDecimal.ZERO;
        for(Box box:boxList) {
            areaToWrap = areaToWrap.add(BigDecimal.valueOf(calculateBoxAreaToWrap(box)));
        }
        return areaToWrap;
    }

}
