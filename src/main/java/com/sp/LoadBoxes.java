package com.sp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public final class LoadBoxes {

    private File file = new File("src\\main\\resources\\boxes.txt");

    public List<Box> generateBoxList(List<String> boxes) {
        List<Box> generatedBoxList = new ArrayList<>();
        for (String s : boxes) {
            Box box = createBox(s);
            generatedBoxList.add(box);
        }
        return generatedBoxList;
    }

    private Box createBox (String box) {
        String[] array = box.split("x", 3);
        double sideOne = Double.valueOf(array[0]);
        double sideTwo = Double.valueOf(array[1]);
        double sideThree = Double.valueOf(array[2]);
        return new Box(sideOne, sideTwo, sideThree);
    }

    public List<String> readFile() {
        List<String> textList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                line = line.replace(" ", "");
                textList.add(line);
                line = br.readLine();
            }
            br.close();
        } catch (IOException ioe) {

        }
        return textList;
    }

}
