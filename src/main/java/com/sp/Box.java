package com.sp;

import java.util.*;

public final class Box {

    private double edgeOne;
    private double edgeTwo;
    private double edgeThree;
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private double totalArea;

    public Box(double edgeOne, double edgeTwo, double edgeThree) {
        this.edgeOne = edgeOne;
        this.edgeTwo = edgeTwo;
        this.edgeThree = edgeThree;
        sideOne = edgeOne*edgeTwo;
        sideTwo = edgeTwo*edgeThree;
        sideThree = edgeThree*edgeOne;
        totalArea = countTotalArea();
    }

    public double getEdgeOne() {
        return edgeOne;
    }

    public double getEdgeTwo() {
        return edgeTwo;
    }

    public double getEdgeThree() {
        return edgeThree;
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public double getTotalArea() {
        return totalArea;
    }

    private double countTotalArea() {
        return 2*(sideOne + sideTwo + sideThree);
    }

    public double getSmallestSide() {
        List<Double> smallestSideList = new LinkedList<>();
        smallestSideList.add(sideOne);
        if (sideTwo<smallestSideList.get(0))
            smallestSideList.add(0, sideTwo);
        if (sideThree<smallestSideList.get(0))
            smallestSideList.add(0, sideThree);
        return smallestSideList.get(0);
    }

    @Override
    public String toString() {
        return "Box{" +
                "edgeOne=" + edgeOne +
                ", edgeTwo=" + edgeTwo +
                ", edgeThree=" + edgeThree +
                ", sideOne=" + sideOne +
                ", sideTwo=" + sideTwo +
                ", sideThree=" + sideThree +
                ", totalArea=" + totalArea +
                '}';
    }
}
