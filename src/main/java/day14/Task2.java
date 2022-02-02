package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2  {
        public static void main(String[] args) throws FileNotFoundException {
                File file = new File("people");
                parseFileToStringList(file);
        }
        public static List<String> parseFileToStringList(File file){
                List<String> list = new ArrayList<>();
                try {
                        Scanner scanner = new Scanner(file);
                        while (scanner.hasNextLine()){
                                list.add(scanner.nextLine());
                        }
                        for(int i=0; i< list.size(); i++){
                        if(list.get(i).contains("-")){
                                System.out.println("Некорректный входной файл");
                                list.clear();
                        }}
                        System.out.println(list);
                        scanner.close();
                } catch (FileNotFoundException e) {
                        System.out.println("Файл не найден");
                }
                return list;
        }
}
