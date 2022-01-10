package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer{
    public Paladin(){
        health=100;
        physAtt=15;
        physDef = 50;
        magicDef = 20;
    }

    @Override
    public void physicalAttack(Hero hero) {
        System.out.println("paladin attacks "+ hero.toString());
        if((hero.health - (physAtt - physAtt* hero.physDef/100))<1){
            hero.health=0;
        } else { hero.health= hero.health - (physAtt - physAtt* hero.physDef/100);}
        System.out.println(hero.toString());
    }

    @Override
    public void healHimself() {
        System.out.println("paladin heals himself");
        if((health+25)>100){
            health=100;
        } else {health+=25;}
        System.out.println(toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        System.out.println("paladin heals "+hero.toString());
        if((hero.health+10)>100){
            hero.health=100;
        } else {hero.health+=10;}
        System.out.println(hero.toString());
    }

    public String toString(){
        return "paladin (health "+health+")";
    }
}
