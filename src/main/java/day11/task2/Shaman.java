package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer{
    public Shaman(){
        health=100;
        physAtt=10;
        magicAtt =15;
        physDef = 20;
        magicDef = 20;
    }

    @Override
    public void physicalAttack(Hero hero) {
        System.out.println("shaman attacks "+ hero.toString());
        if((hero.health - (physAtt - physAtt* hero.physDef/100))<1){
            hero.health=0;
        } else { hero.health= hero.health - (physAtt - physAtt* hero.physDef/100);}
        System.out.println(hero.toString());
    }

    @Override
    public void magicalAttack(Hero hero) {
        System.out.println("shaman attacks "+ hero.toString());
        if((hero.health - (magicAtt - magicAtt* hero.magicDef/100))<1){
            hero.health=0;
        } else {hero.health= hero.health - (magicAtt - magicAtt* hero.magicDef/100);}
        System.out.println(hero.toString());
    }

    @Override
    public void healHimself() {
        System.out.println("shaman heals himself");
        if((health+50)>100){
            health=100;
        } else { health+=50;}
        System.out.println(toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        System.out.println("shaman heals "+hero.toString());
        if((hero.health+30)>100){
            hero.health=100;
        } else { hero.health+=30;}
        System.out.println(hero.toString());
    }

    public String toString(){
        return "shaman (health "+health+")";
    }
}
