package day11.task2;

public class Paladin extends Hero implements Healer{
    private int healHimself;
    private int healTeammate;
    public Paladin(){
        physAtt=15;
        physDef = 50;
        magicDef = 20;
        healHimself=25;
        healTeammate=10;
    }

    @Override
    public void healHimself() {
        System.out.println("paladin heals himself");
        if((health+healHimself)>maxHealth){
            health=maxHealth;
        } else {health+=healHimself;}
        System.out.println(toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        System.out.println("paladin heals "+hero.toString());
        if((hero.health+healTeammate)>maxHealth){
            hero.health=maxHealth;
        } else {hero.health+=healTeammate;}
        System.out.println(hero.toString());
    }

    public String toString(){
        return "paladin (health "+health+")";
    }
}
