package day12.task5;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> musicArtist;
    public MusicBand(String name, int year, List<MusicArtist> musicArtist){
        this.name=name;
        this.year=year;
        this.musicArtist =musicArtist;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand " +
                "name '" + name + '\'' +
                ", year = " + year;
    }

    public static void transferMembers(MusicBand m1, MusicBand m2){
        System.out.println("участники группы "+m1+" переходят в группу "+m2);
        m2.musicArtist.addAll(m1.musicArtist);
        m1.musicArtist.clear();
    }

    public void printMembers(){
        if(musicArtist.isEmpty()){
            System.out.println("В группе "+toString()+" нет участников");
        }else{
            System.out.println("Участники группы "+toString()+":");
            System.out.println(getMembers());}
    }

    public List<MusicArtist> getMembers(){
        return musicArtist;
    }
}
