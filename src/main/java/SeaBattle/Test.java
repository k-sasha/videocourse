package SeaBattle;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Field field1 = new Field(1);
        Field field2 = new Field(2);


        Ship fourDeckShip1_1 = new FourDeckShip();
        Ship threeDeckShip1_1 = new ThreeDeckShip();
        Ship threeDeckShip1_2 = new ThreeDeckShip();
        Ship doubleDeckShip1_1 = new DoubleDeckShip();
        Ship doubleDeckShip1_2 = new DoubleDeckShip();
        Ship doubleDeckShip1_3 = new DoubleDeckShip();
        Ship singleDeckShip1_1 = new SingleDeckShip();
        Ship singleDeckShip1_2 = new SingleDeckShip();
        Ship singleDeckShip1_3 = new SingleDeckShip();
        Ship singleDeckShip1_4 = new SingleDeckShip();

        Ship fourDeckShip2_1 = new FourDeckShip();
        Ship threeDeckShip2_1 = new ThreeDeckShip();
        Ship threeDeckShip2_2 = new ThreeDeckShip();
        Ship doubleDeckShip2_1 = new DoubleDeckShip();
        Ship doubleDeckShip2_2 = new DoubleDeckShip();
        Ship doubleDeckShip2_3 = new DoubleDeckShip();
        Ship singleDeckShip2_1 = new SingleDeckShip();
        Ship singleDeckShip2_2 = new SingleDeckShip();
        Ship singleDeckShip2_3 = new SingleDeckShip();
        Ship singleDeckShip2_4 = new SingleDeckShip();

       Ship [] ships1 = {fourDeckShip1_1, threeDeckShip1_1, threeDeckShip1_2, doubleDeckShip1_1, doubleDeckShip1_2, doubleDeckShip1_3, singleDeckShip1_1, singleDeckShip1_2, singleDeckShip1_3, singleDeckShip1_4} ;
       Ship [] ships2 = {fourDeckShip2_1, threeDeckShip2_1, threeDeckShip2_2, doubleDeckShip2_1, doubleDeckShip2_2, doubleDeckShip2_3, singleDeckShip2_1, singleDeckShip2_2, singleDeckShip2_3, singleDeckShip2_4} ;

        System.out.println("Начнем расставлять корабли на поле Player 1. Другой игрок не смотри!");

        Scanner scanner1 = new Scanner(System.in);

        for(int i = 0; i< ships1.length; i++){
            do{if(i==0){ships1[i].shipChecked(scanner1,ships1[i].note, ships1[i].coordinates );}
                else{ships1[i].shipChecked(scanner1,ships1[i].note, ships1[i].coordinates, Ship.previousShips(ships1,i) );}
                if(ships1[i].array!=null){//System.out.println(ships1[i]);
                field1.addShip(ships1[i]);}
            }while (ships1[i].array==null);
        }
       // field1.printField();
        System.out.println();

        System.out.println("Теперь расставляет корабли на поле Player 2. Другой игрок не смотри!");
        for(int i = 0; i< ships2.length; i++){
            do{if(i==0){ships2[i].shipChecked(scanner1,ships2[i].note, ships2[i].coordinates );}
            else{ships2[i].shipChecked(scanner1,ships2[i].note, ships2[i].coordinates, Ship.previousShips(ships2,i) );}
                if(ships2[i].array!=null){//System.out.println(ships2[i]);
                    field2.addShip(ships2[i]);}
            }while (ships2[i].array==null);
        }
        //field2.printField();

        Player player1 = new Player(field1,1, ships1);
        Player player2 = new Player(field2,2, ships2);
        Player.makeMoves(player1, player2, scanner1);

    }

}


//  1,2;1,3;1,4;1,5           0,9;1,9;2,9;3,9
//  2,8;3,8;4,8               2,1;2,2;2,3
//  4,1;5,1;6,1               4,4;4,5;4,6
//  4,4;4,5                   5,2;6,2
//  7,3;7,4                   7,6;8,6
//  8,7;8,8                   6,8;6,9
//  0,7                       0,2
//  6,7                       1,6
//  2,0                       5,0
//  9,1                       9,0