package day11.task2;

public abstract class Hero implements PhysAttack {
    protected int health; //(здоровье)
    protected int physDef; // (процент поглощения физического урона)
    protected int magicDef; // (процент поглощения магического урона)
    protected int physAtt; // (величина физической атаки), по необходимости
    protected int maxHealth=100;
    protected int minHealth=0;
    public Hero(){
        health=maxHealth;
    }

    public void physicalAttack(Hero hero) {
        System.out.println(toString()+" attacks "+ hero.toString());
        if((hero.health - (physAtt - physAtt* hero.physDef/100))<=minHealth){
            hero.health=minHealth;
        } else { hero.health= hero.health - (physAtt - physAtt* hero.physDef/100);}
        System.out.println(hero.toString());
    }
}
