package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand m1 = new MusicBand("A", 2010);
        MusicBand m2 = new MusicBand("B", 1990);
        MusicBand m3 = new MusicBand("C", 1983);
        MusicBand m4 = new MusicBand("D", 2015);
        MusicBand m5 = new MusicBand("E", 2007);
        MusicBand m6 = new MusicBand("F", 1999);
        MusicBand m7 = new MusicBand("J", 1964);
        MusicBand m8 = new MusicBand("H", 1990);
        MusicBand m9 = new MusicBand("I", 2011);
        MusicBand m10 = new MusicBand("J", 2019);

        List<MusicBand> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m5);
        list.add(m6);
        list.add(m7);
        list.add(m8);
        list.add(m9);
        list.add(m10);

        Collections.shuffle(list);
        List<MusicBand> newList = groupsAfter2000(list);
        System.out.println(list);
        System.out.println(newList);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> newList= new ArrayList<>();
        for(int i = 0; i< bands.size(); i++){
            if(bands.get(i).getYear()>2000){
                newList.add(bands.get(i));
            }
        }
        return newList;
    }

}
