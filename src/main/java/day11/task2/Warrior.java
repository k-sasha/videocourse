package day11.task2;

public class Warrior extends Hero implements PhysAttack{
    public Warrior(){
        health=100;
        physAtt=30;
        physDef=80;
    }

    @Override
    public void physicalAttack(Hero hero) {
        System.out.println("warrior attacks "+ hero.toString());
        if((hero.health - (physAtt - physAtt* hero.physDef/100))<1){
            hero.health=0;
        } else { hero.health= hero.health - (physAtt - physAtt* hero.physDef/100);}
        System.out.println(hero.toString());
    }

    public String toString(){
        return "warrior (health "+health+")";
    }
}
