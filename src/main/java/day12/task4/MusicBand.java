package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> nameAndSurname;
    public MusicBand(String name, int year, List<String> nameAndSurname){
        this.name=name;
        this.year=year;
        this.nameAndSurname=nameAndSurname;
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
        m2.nameAndSurname.addAll(m1.nameAndSurname);
        m1.nameAndSurname.clear();
    }

    public void printMembers(){
        if(nameAndSurname.isEmpty()){
            System.out.println("В группе "+toString()+" нет участников");
        }else{
            System.out.println("Участники группы "+toString()+":");
            System.out.println(getMembers());}
    }

    public List<String> getMembers(){
        return nameAndSurname;
    }
}
