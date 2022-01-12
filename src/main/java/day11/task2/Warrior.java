package day11.task2;

public class Warrior extends Hero{
    public Warrior(){
        physAtt=30;
        physDef=80;
    }

    public String toString(){
        return "warrior (health "+health+")";
    }
}
