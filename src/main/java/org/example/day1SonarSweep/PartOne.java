package org.example.day1SonarSweep;

import java.util.*;
import java.io.FileNotFoundException;

import static org.example.Util.ReadFile.outputAsIntegerList;

public class PartOne {
    public static void main (String[] args) throws FileNotFoundException {
        ArrayList<Integer> numberList = outputAsIntegerList("/data/day1.txt");

        int result = countDepthIncrement(numberList);

        System.out.println("Problem one answer = " + result);
    }

    /***
     *
     * @param numberList
     * @return
     */
    public static int countDepthIncrement(List<Integer> numberList) {
        int result = 0;

        for(int i = 1; i < numberList.size(); i++) {
            if(numberList.get(i) > numberList.get(i - 1))
                result++;
        }
        return result;
    }
}