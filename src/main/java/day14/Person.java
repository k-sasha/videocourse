package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int year;
    public Person(String name, int year){
        this.name=name;
        this.year=year;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static List<Person> parseFileToObjList(File file){
       List<Person> list = new ArrayList<>();
        List<String> listString = new ArrayList<>();
       try {
           Scanner scaner = new Scanner(file);
           while (scaner.hasNextLine()){
               listString.add(scaner.nextLine());
           }

           for(int i=0; i<listString.size(); i++){
               String [] line = listString.get(i).split(" ");
               int age = Integer.parseInt(line[1]);
               if(age<0){
                   try {
                       throw new IlligalAge();
                   } catch (IlligalAge e) {
                       System.out.println("Некорректный входной файл");
                   }
               }else{
               list.add(new Person(line[0], age));}
           }
       } catch (FileNotFoundException e) {
           System.out.println("Файл не найден");
       }
       System.out.println(list);
       return list;
   }
}

class IlligalAge extends IOException{
    IlligalAge(){}
}
