package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("/Users/Shuruchka/Documents/GitHub/videocourse/src/main/resources/shoes.csv");
        File file2 = new File("missing_shoes");
        missingShoes(file, file2);
    }

    public static void missingShoes(File file, File file2){
        List<String> allMissingShoes = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String [] separatePosition = line.split(";");
                if(separatePosition.length!=3){ throw new IllegalArgumentException("incorrect number of positions");}
                if(line.isEmpty()){throw new IllegalArgumentException("file is empty");}
                if(Integer.parseInt(separatePosition[2])==0){
                    allMissingShoes.add(separatePosition[0] + ","+separatePosition[1]+ ","+separatePosition[2]);
                    }
            }
            System.out.println(allMissingShoes);
            PrintWriter pw = new PrintWriter(file2);
            for(int i=0; i<allMissingShoes.size(); i++){
                pw.println(allMissingShoes.get(i));}
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
