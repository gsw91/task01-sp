package com.sp;

import java.math.BigDecimal;
import java.util.List;

public class Configuration {

    public void run() {
        LoadBoxes loadBoxes = new LoadBoxes();
        List<String> fileText = loadBoxes.readFile();
        List<Box> generatedBoxes = loadBoxes.generateBoxList(fileText);
        WrappingCalculation calculation = new WrappingCalculation();
        BigDecimal result = calculation.calculateBoxesAreaToWrap(generatedBoxes);
        System.out.println("We need " + result + " dm2 of paper");
    }

}
