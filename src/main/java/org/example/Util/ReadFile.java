package org.example.Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    /***
     *
     * @param path of file
     * @return each line as Integer
     * @throws FileNotFoundException
     */
    public static ArrayList<Integer> outputAsIntegerList(String path) throws FileNotFoundException {
        ArrayList<Integer> line = new ArrayList<>();
        File text = new File(path);
        Scanner input = new Scanner(text);
        while(input.hasNextLine()) {
            line.add(Integer.parseInt(input.nextLine()));
        }
        return line;
    }

    /***
     *
     * @param path of file
     * @return each line as String
     * @throws FileNotFoundException
     */
    public static ArrayList<String> outputAsStringList(String path) throws FileNotFoundException {
        ArrayList<String> line = new ArrayList<>();
        File text = new File(path);
        Scanner input = new Scanner(text);
        while(input.hasNextLine()) {
            line.add(input.nextLine());
        }
        return line;
    }
}
