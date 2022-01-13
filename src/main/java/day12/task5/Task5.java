package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> musicArtist1 = new ArrayList<>();
        musicArtist1.add(new MusicArtist("Ivan", 24));
        musicArtist1.add(new MusicArtist("Vlad", 22));
        musicArtist1.add(new MusicArtist("Stepan", 23));
        musicArtist1.add(new MusicArtist("Maria", 27));
        musicArtist1.add(new MusicArtist("Roman", 29));


        MusicBand m1 = new MusicBand("A", 2010,musicArtist1);
        MusicBand m2 = new MusicBand("B", 1990, new ArrayList<>(Arrays.asList(new MusicArtist("Petr",32), new MusicArtist("Sasha", 27))));

        MusicBand.transferMembers(m1,m2);
        System.out.println();
        m1.printMembers();
        System.out.println();
        m2.printMembers();
    }
}
