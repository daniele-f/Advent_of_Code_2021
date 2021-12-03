package org.example.day1SonarSweep;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.example.Util.ReadFile.outputAsIntegerList;

public class PartTwo {
    public static void main (String[] args) throws FileNotFoundException {
        ArrayList<Integer> numberList = outputAsIntegerList("/data/day1.txt");

        int result = countWindowIncrement(numberList);

        System.out.println("Problem two answer = " + result);
    }


    private static int countWindowIncrement(ArrayList<Integer> numberList) {
        int result = 0;
        int prevSum = 0;

        for(int i = 2; i < numberList.size(); i++) {
            int sum = numberList.get(i - 2) + numberList.get(i - 1) + numberList.get(i);
            if(prevSum != 0)
                if(sum > prevSum)
                    result++;
            prevSum = sum;

        }
        return result;
    }
}