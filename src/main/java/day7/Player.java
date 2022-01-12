package day7;

public class Player {
    private int stamina;
    private final static int MAX_STAMINA=100;
    private final static int MIN_STAMINA=0;
    private static int countPlayers;
    Player(int stamina){
        if(stamina<MAX_STAMINA+1 && stamina>MIN_STAMINA){
        this.stamina=stamina;
        if (countPlayers<6){
        countPlayers++;}}
        else{
            System.out.println("Указана неверная выносливость");
        }
    }
    public void run(Player p1){
        if(stamina>0){
        stamina--;
        if(stamina==0){
            countPlayers--;
          }
        }
    }
    public static void info(){
        System.out.println("На поле "+countPlayers+" игроков");
        int freePlace =6- countPlayers;
        if(countPlayers<6){
            System.out.println("Команды неполные. На поле еще есть "+freePlace+" свободных мест");
        }else{
            System.out.println("На поле нет свободных мест");
        }
    }
}
