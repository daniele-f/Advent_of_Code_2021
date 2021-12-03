package org.example.day2Drive;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.example.Util.ReadFile.*;

public class PartOne {
    public static void main (String[] args) throws FileNotFoundException {
        ArrayList<String> list = outputAsStringList("/data/day2.txt");

        String movement = moveSub(list);

        System.out.println("Problem one answer = " + movement);
    }

    public static String moveSub(List<String> listRow) {
        int horiPos = 0;
        int vertPos = 0;

        for (String movement : listRow) {
            String[] arrOfStr = movement.split(" ", 2);

            String direction = arrOfStr[0];
            int amount = Integer.parseInt(arrOfStr[1]);

            switch (direction) {
                case "forward":
                    horiPos += amount;
                    break;
                case "up":
                    vertPos -= amount;
                    break;
                case "down":
                    vertPos += amount;
                    break;
                default:
                    break;
            }
        }
        return horiPos * vertPos + "";
    }
}