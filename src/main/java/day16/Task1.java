package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test");
        printResult(file);

    }
    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String [] numbersString = line.split(" ");
            double sum = 0;
            for(String s: numbersString){
                sum+=Double.parseDouble(s);
            }
            double average = sum/ numbersString.length;
            System.out.print(average +" --> ");
            System.out.printf("%.3f",average);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
}

