package org.example.day3BinaryDiagnostic;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.example.Util.ReadFile.outputAsIntegerList;

public class PartOne {
    public static void main (String[] args) throws FileNotFoundException {
        ArrayList<Integer> numberList = outputAsIntegerList("/data/day3.txt");

        int result = CalculatePowerConsumption(numberList);

        System.out.println("Problem one answer = " + result);
    }

    public static int CalculatePowerConsumption(List<Integer> numberList) {
        int powerConsumption = 0;

        for(int i = 1; i < numberList.size(); i++) {
            if(numberList.get(i) > numberList.get(i - 1))
                powerConsumption++;
        }
        return powerConsumption;
    }
}