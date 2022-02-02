package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test");
        printSumDigits(file);
    }
    public static void printSumDigits(File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String [] numbersString = line.split(" ");
            if(numbersString.length!=10){
                try{throw new IllegalArgumentException();}
                catch (IllegalArgumentException e){
                    System.out.println("Некорректный входной файл");
                }
            } else {
            int [] numbers = new int[10];
            int counter =0;
            for(String s: numbersString){
                numbers[counter++]=Integer.parseInt(s);
            }
            int sum=0;
            for(int i: numbers){
                sum+=i;
            }
            System.out.println(sum);}
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
