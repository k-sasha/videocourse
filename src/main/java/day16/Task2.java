package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        File f1 = new File("file1.txt");
        createFileWithRandomNumbers(f1,1000,100); //create new file f1, filled with random numbers 1000 pieces, range 100
        File f2 = new File("file2.txt");  //create new file f2
        createFileWithAverage(f1,f2,20); // create new file f2, calculate the average (of counterMax = 20) from the file f1 and fill f2
        printResult(f2); // calculate the sum of numbers from f2
    }

    public static void createFileWithRandomNumbers(File f1, int amongOfNumbers, int range){
        Random random = new Random();  // random numbers for file f1
//        int amongOfNumbers = 12;
//        int range =100;
        try {
            f1.createNewFile();
            PrintWriter pw = new PrintWriter(f1);
            for (int i = 0; i < amongOfNumbers; i++) {
                pw.println(random.nextInt(range));}
            pw.close();
        }catch (FileNotFoundException e){
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createFileWithAverage(File f1, File f2, int counterMax){
        try {                      // create file f2
            f2.createNewFile();
        List<String> list = new ArrayList<>();  //calculate the average from the file f1
            Scanner scanner = new Scanner(f1);
            while(scanner.hasNextLine()){
                list.add(scanner.nextLine());
            }
            scanner.close();
       // int counterMax = 4;
        double[] file2 = new double[list.size()/counterMax];
        for(int i=0, j=0; i< list.size() || j< file2.length; i=i+counterMax, j++){
            double sum = 0;
            int counterMin = i;
            while(counterMin<i+counterMax){
                sum+=Double.parseDouble(list.get(counterMin));
                counterMin++;
            }
            file2[j]=sum/counterMax;
        }
        //System.out.println(Arrays.toString(file2));
            PrintWriter pw2 = new PrintWriter(f2); // f2 is filled with average numbers from f1
            for(double d: file2){
                pw2.println(d);
            }
            pw2.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printResult(File file){
        try {
            Scanner scanner= new Scanner(file);
            double sum =0;
            while (scanner.hasNextLine()){
               sum+= Double.parseDouble(scanner.nextLine());
            }
            //System.out.println(sum);
            System.out.printf("%.0f", sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
}
