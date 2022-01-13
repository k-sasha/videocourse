package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> nameAndSurname1 = new ArrayList<>();
        nameAndSurname1.add("Sidorov Ivan");
        nameAndSurname1.add("Petrov Vlad");
        nameAndSurname1.add("Syvorov Stepan");
        nameAndSurname1.add("Kozlova Maria");
        nameAndSurname1.add("Kozlov Vlad");


//        List<String> nameAndSurname2 = new ArrayList<>();
//        nameAndSurname2.add("Ivanov Petr");
//        nameAndSurname2.add("Ivanov Sasha");

        MusicBand m1 = new MusicBand("A", 2010,nameAndSurname1);
        MusicBand m2 = new MusicBand("B", 1990, new ArrayList<>(Arrays.asList("Ivanov Petr", "Ivanov Sasha")));

        MusicBand.transferMembers(m1,m2);
        System.out.println();
        m1.printMembers();
        System.out.println();
        m2.printMembers();


    }
}
