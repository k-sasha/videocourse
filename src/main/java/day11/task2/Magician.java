package day11.task2;

public class Magician extends Hero implements MagicAttack{
    private int magicAtt; // (величина магической атаки), по необходимости
    public Magician(){
         physAtt=5;
         magicAtt =20;
         magicDef = 80;
    }

    @Override
    public void magicalAttack(Hero hero) {
        System.out.println("magician attacks "+ hero.toString());
        if((hero.health - (magicAtt - magicAtt* hero.magicDef/100))<=minHealth){
            hero.health=minHealth;
        } else {hero.health= hero.health - (magicAtt - magicAtt* hero.magicDef/100);}
        System.out.println(hero.toString());
    }

    public String toString(){
        return "magician (health "+health+")";
    }
}
