package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    public Magician(){
        health=100;
         physAtt=5;
         magicAtt =20; // (величина магической атаки), по необходимости
         magicDef = 80;
    }

    @Override
    public void physicalAttack(Hero hero) {
        System.out.println("magician attacks "+ hero.toString());
        if((hero.health - (physAtt - physAtt* hero.physDef/100))<1){
            hero.health=0;
        } else { hero.health= hero.health - (physAtt - physAtt* hero.physDef/100);}
        System.out.println(hero.toString());
    }

    @Override
    public void magicalAttack(Hero hero) {
        System.out.println("magician attacks "+ hero.toString());
        if((hero.health - (magicAtt - magicAtt* hero.magicDef/100))<1){
            hero.health=0;
        } else {hero.health= hero.health - (magicAtt - magicAtt* hero.magicDef/100);}
        System.out.println(hero.toString());
    }

    public String toString(){
        return "magician (health "+health+")";
    }
}
