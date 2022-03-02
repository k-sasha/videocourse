package SeaBattle;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private String objectState;
    private static String result="";
    private Field myfield;
    private int id;
    private Ship [] ships;
    Player(Field myfield, int id, Ship [] ships){
        this.myfield=myfield;
        this.id=id;
        this.ships=ships;
    }

    private String hit(Player player, Point p){
        if(player.myfield.getField()[p.getX()][p.getY()]==FieldPiece.SHIP){
            player.myfield.getField()[p.getX()][p.getY()]=FieldPiece.CAUGHT;
            for(int i = 0; i<player.ships.length; i++){
                for(int j = 0; j<player.ships[i].array.length; j++){
                    if(player.ships[i].array[j]==null){continue;}
                    if(player.ships[i].array[j].equals(p)){
                        player.ships[i].array[j]=null;
                        if(player.ships[i].isShipSunk()){
                            result="Утопил";
                        }else{result="Попадание!";}
                    }
                }
            }
        }else if (player.myfield.getField()[p.getX()][p.getY()]==FieldPiece.CAUGHT){
            System.out.println("ты уже стрелял сюда.");
            result="Попадание!";
        }
        else {player.myfield.getField()[p.getX()][p.getY()]=FieldPiece.MISS;result="Мимо";}
        System.out.println(result);
        return result;
    }

    public static void makeMoves(Player player1, Player player2, Scanner scanner){
        System.out.println();
        System.out.println("корабли расставлены!");
        Random random=new Random();
        int firstPlayer= random.nextInt(2)+1;
            if(firstPlayer==player1.id){
                System.out.println();
                System.out.println("ходит игрок 1. Введи координаты x,y");
                player2.myfield.printFieldEnemy();
                Point point;
                do {point = coordinateCheck(scanner);
                }while (point==null);
                player1.hit(player2,point);
                player2.myfield.printFieldEnemy();
                if(result.equals("Попадание!") || result.equals("Утопил")){player1.objectState="Next";player2.objectState="Wait";}
                else {player2.objectState="Next";player1.objectState="Wait";}
            }else {
                System.out.println();
                System.out.println("ходит игрок 2. Введи координаты x,y");
                player1.myfield.printFieldEnemy();
                Point point;
                do {point = coordinateCheck(scanner);
                }while (point==null);
                player2.hit(player1,point);
                player1.myfield.printFieldEnemy();
                if(result.equals("Попадание!") || result.equals("Утопил")){player2.objectState="Next";player1.objectState="Wait";}
                else {player1.objectState="Next";player2.objectState="Wait";}
            }

      try{
         while (true){
            if (player1.objectState.equals("Next")) {
                do {
                    System.out.println();
                    System.out.println("Игрок " + player1.id + " ходи. Введи координаты x,y");
                    player2.myfield.printFieldEnemy();
                    Point point;
                    do {point = coordinateCheck(scanner);
                    }while (point==null);
                    player1.hit(player2, point);
                    player2.myfield.printFieldEnemy();
                    if (result.equals("Мимо")) {player2.objectState="Next";player1.objectState="Wait"; break;}
                    if (player2.AreAllShipsSunk()) {
                        throw new IllegalArgumentException("Игра окончена. Игрок " + player1.id + " победил!");
                    }
                } while (result.equals("Попадание!") || result.equals("Утопил"));
            }

            if (player2.objectState.equals("Next")) {
                do {
                    System.out.println();
                    System.out.println("Игрок " + player2.id + " ходи. Введи координаты x,y");
                    player1.myfield.printFieldEnemy();
                    Point point;
                    do {point = coordinateCheck(scanner);
                    }while (point==null);
                    player2.hit(player1, point);
                    player1.myfield.printFieldEnemy();
                    if (result.equals("Мимо")){ player1.objectState="Next";player2.objectState="Wait";break;}
                    if (player1.AreAllShipsSunk()) {
                        System.out.println();
                        throw new IllegalArgumentException("Игра окончена. Игрок " + player2.id + " победил!");
                    }
                } while (result.equals("Попадание!") || result.equals("Утопил"));
            }}
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            player1.myfield.printField();
            player2.myfield.printField();
        }
    }

    private boolean AreAllShipsSunk(){
        int i=0;
        while(i< ships.length){
            if(!ships[i].isShipSunk()) return false;
            i++;
        }
        return true;
    }

    private static Point coordinateCheck(Scanner scanner){
        Point point=null;
            try {
                String line = scanner.nextLine();
                String[] s = line.split(",");
                if (s.length != 2) throw new IllegalArgumentException("необходимо ввести две координаты");
                if (Integer.parseInt(s[0]) < 0 || Integer.parseInt(s[0]) > 9 || Integer.parseInt(s[1]) < 0 || Integer.parseInt(s[1]) > 9)
                    throw new IllegalArgumentException("диапозон введеных координат д/быть от 0 до 9");
                point=new Point();
                point.setX(Integer.parseInt(s[0]));
                point.setY(Integer.parseInt(s[1]));
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        return point;
    }
}
