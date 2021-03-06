package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer{
    private int magicAtt; // (величина магической атаки), по необходимости
    private int healHimself;
    private int healTeammate;
    public Shaman(){
        physAtt=10;
        magicAtt =15;
        physDef = 20;
        magicDef = 20;
        healHimself=50;
        healTeammate=30;
    }

    @Override
    public void magicalAttack(Hero hero) {
        System.out.println("shaman attacks "+ hero.toString());
        if((hero.health - (magicAtt - magicAtt* hero.magicDef/100))<=minHealth){
            hero.health=minHealth;
        } else {hero.health= hero.health - (magicAtt - magicAtt* hero.magicDef/100);}
        System.out.println(hero.toString());
    }

    @Override
    public void healHimself() {
        System.out.println("shaman heals himself");
        if((health+healHimself)>maxHealth){
            health=maxHealth;
        } else { health+=healHimself;}
        System.out.println(toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        System.out.println("shaman heals "+hero.toString());
        if((hero.health+healTeammate)>maxHealth){
            hero.health=maxHealth;
        } else { hero.health+=healTeammate;}
        System.out.println(hero.toString());
    }

    public String toString(){
        return "shaman (health "+health+")";
    }
}
