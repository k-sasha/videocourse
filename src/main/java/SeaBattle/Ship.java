package SeaBattle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ship {
    protected Point[] array;
    protected String direction;
    protected String note;
    protected int coordinates;

    public boolean isShipSunk(){
        if(array.length==1 && array[0]==null)return true;
        int i=0;
        while(i< array.length){
            if(array[i]!=null) return false;
            i++;
        }
        return true;
    }

    public boolean shipChecked(Scanner scanner, String note,  int coordinates, Ship ... previousShips) {
        System.out.println(note);
        String line = scanner.nextLine();
        String[] s = line.split(",|;");

        try {
            if (s.length != coordinates) {
                throw new IllegalArgumentException("Количество координат д/быть: " + coordinates);
            }
            if(coordinates==8){
                array = new Point[4];
                array[0]=new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
                array[1]=new Point(Integer.parseInt(s[2]), Integer.parseInt(s[3]));
                array[2]=new Point(Integer.parseInt(s[4]), Integer.parseInt(s[5]));
                array[3]=new Point(Integer.parseInt(s[6]), Integer.parseInt(s[7]));
            }
            if(coordinates==6){
                array = new Point[3];
                array[0]=new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
                array[1]=new Point(Integer.parseInt(s[2]), Integer.parseInt(s[3]));
                array[2]=new Point(Integer.parseInt(s[4]), Integer.parseInt(s[5]));
            }
            if(coordinates==4){
                array = new Point[2];
                array[0]=new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
                array[1]=new Point(Integer.parseInt(s[2]), Integer.parseInt(s[3]));
            }
            if(coordinates==2){
                array = new Point[1];
                array[0]=new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            }
            this.checkRange();
            if(array.length>1)this.checkValidityOfCoordinates();
            this.placementOnTheField(this, previousShips);
            this.halo();
            return false;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            array=null;
            return true;
        }
    }



    private void checkRange() throws IllegalArgumentException{
            for(int i=0; i<array.length; i++){
                if(array[i].getX()<0 || array[i].getX()>9 || array[i].getY()<0 || array[i].getY()>9){throw new IllegalArgumentException("диапозон введеных координат д/быть от 0 до 9");}
            }
    }


    private void checkValidityOfCoordinates() throws IllegalArgumentException{
        boolean equalsX=false;
        boolean standInLineY1=false; // from left to right
        boolean standInLineY2=false; // from right to left
        boolean equalsY=false;
        boolean standInLineX1=false; // from top to down
        boolean standInLineX2=false; // from bottom to top
        for(int i=1; i<array.length; i++){                                      //equalsX
            equalsX=false;
            if(array[0].getX()==array[i].getX()){ equalsX=true;}
            else{break;}
        }
        for(int i=1; i<array.length; i++){                                     //standInLineY1
            standInLineY1=false;
            if((array[i].getY()==array[0].getY()+i)){standInLineY1=true;}
            else{break;}
        }
        for(int i=1; i<array.length; i++){                                    //standInLineY2
            standInLineY2=false;
            if((array[i].getY()==array[0].getY()-i)){standInLineY2=true;}
            else{break;}
        }

        for(int i=1; i<array.length; i++){                                      //equalsY
            equalsY=false;
            if(array[0].getY()==array[i].getY()){ equalsY=true;}
            else{break;}
        }
        for(int i=1; i<array.length; i++){                                     //standInLineX1
            standInLineX1=false;
            if((array[i].getX()==array[0].getX()+i)){standInLineX1=true;}
            else{break;}
        }
        for(int i=1; i<array.length; i++){                                     //standInLineX2
            standInLineX2=false;
            if((array[i].getX()==array[0].getX()-i)){standInLineX2=true;}
            else{break;}
        }

            if(equalsX){
            if(standInLineY1 || standInLineY2){
                direction="горизонтальный корабль";
                //System.out.println(direction);
            }else{  throw new IllegalArgumentException("координаты Y записаны не по порядку");}
        } else if(equalsY){
            if(standInLineX1 || standInLineX2){
                direction ="вертикальный корабль";
                //System.out.println(direction);
            }else{  throw new IllegalArgumentException("координаты X записаны не по порядку");}
        } else {  throw new IllegalArgumentException("не правильные координаты");}
    }


    public Point[] halo(){
        List<Point> halo = new ArrayList<>();
        if(direction.equals("однопалубный корабль")){
            if(array[0].getX()!=0){
                halo.add(new Point(array[0].getX()-1,array[0].getY())); // add to top
                if(array[0].getY()!=0) halo.add(new Point(array[0].getX()-1,array[0].getY()-1)); //add upper left corner
                if(array[0].getY()!=9) halo.add(new Point(array[0].getX()-1,array[0].getY()+1)); //add upper right corner
            }
            if(array[0].getX()!=9){
                halo.add(new Point(array[0].getX()+1,array[0].getY())); // add down
                if(array[0].getY()!=0) halo.add(new Point(array[0].getX()+1,array[0].getY()-1)); //add lower left corner
                if(array[0].getY()!=9) halo.add(new Point(array[0].getX()+1,array[0].getY()+1)); //add lower right corner
            }
            if(array[0].getY()!=0) halo.add(new Point(array[0].getX(),array[0].getY()-1)); //add left
            if(array[0].getY()!=9) halo.add(new Point(array[0].getX(),array[0].getY()+1)); //add right
        }
        if(direction.equals("горизонтальный корабль")){
                if(array[0].getY()<array[array.length-1].getY()){ //points are located from left to right
                    if(array[0].getY()!=0) {
                        halo.add(new Point(array[0].getX(),array[0].getY()-1)); // add left
                        if(array[0].getX()!=0){ halo.add(new Point(array[0].getX()-1, array[0].getY()-1));} //add upper left corner
                        if(array[0].getX()!=9){ halo.add(new Point(array[0].getX()+1, array[0].getY()-1));} //add lower left corner
                         }
                    if(array[array.length-1].getY()!=9) {
                        halo.add(new Point(array[0].getX(), array[array.length - 1].getY() + 1)); // add right
                        if(array[0].getX()!=0){ halo.add(new Point(array[array.length - 1].getX()-1, array[array.length - 1].getY()+1));} //add upper right corner
                        if(array[0].getX()!=9){ halo.add(new Point(array[array.length - 1].getX()+1, array[array.length - 1].getY()+1));} //add lower right corner
                    }

                }
                else{ //points are located from right to left
                    if(array[array.length-1].getY()!=0) {
                        halo.add(new Point(array[0].getX(),array[array.length-1].getY()-1)); // add left
                        if(array[array.length-1].getX()!=0){ halo.add(new Point(array[array.length-1].getX()-1, array[array.length-1].getY()-1));} //add upper left corner
                        if(array[0].getX()!=9){ halo.add(new Point(array[array.length-1].getX()+1, array[array.length-1].getY()-1));} //add lower left corner
                    }
                    if(array[0].getY()!=9) {
                        halo.add(new Point(array[0].getX(), array[0].getY() + 1));  // add right
                        if (array[0].getX() != 0) { halo.add(new Point(array[0].getX() - 1, array[0].getY() + 1));} //add upper right corner
                        if (array[0].getX() != 9) {halo.add(new Point(array[0].getX() + 1, array[0].getY() + 1));} //add lower right corner
                    }
                }

                for(int i=0; i< array.length; i++){
                    if(array[0].getX()!=0){ halo.add(new Point(array[0].getX()-1, array[i].getY()));} // add to top
                    if(array[0].getX()!=9){ halo.add(new Point(array[0].getX()+1, array[i].getY()));} // add down
                }
        }
        if(direction.equals("вертикальный корабль")){
                if(array[0].getX()<array[array.length-1].getX()){  //points are located from top to down
                    if(array[0].getX()!=0){
                        halo.add(new Point(array[0].getX()-1, array[0].getY())); // add to top
                        if(array[0].getY()!=0){ halo.add(new Point(array[0].getX()-1, array[0].getY()-1));} //add upper left corner
                        if(array[0].getY()!=9){ halo.add(new Point(array[0].getX()-1, array[0].getY()+1));} //add upper right corner
                    }
                    if(array[array.length-1].getX()!=9){
                        halo.add(new Point(array[array.length-1].getX()+1, array[0].getY())); // add down
                        if(array[array.length-1].getY()!=0){ halo.add(new Point(array[array.length-1].getX()+1, array[0].getY()-1));} //add lower left corner
                        if(array[array.length-1].getY()!=9){ halo.add(new Point(array[array.length-1].getX()+1, array[0].getY()+1));} //add lower right corner
                    }
                }else{  //points are located from bottom to top
                    if(array[array.length-1].getX()!=0){
                        halo.add(new Point(array[array.length-1].getX()-1, array[0].getY())); // add to top
                        if(array[array.length-1].getY()!=0){ halo.add(new Point(array[array.length-1].getX()-1, array[array.length-1].getY()-1));} //add upper left corner
                        if(array[array.length-1].getY()!=9){ halo.add(new Point(array[array.length-1].getX()-1, array[array.length-1].getY()+1));} //add upper right corner
                    }
                    if(array[0].getX()!=9) {
                        halo.add(new Point(array[0].getX() + 1, array[0].getY())); // add down
                        if (array[0].getY() != 0) { halo.add(new Point(array[0].getX() + 1, array[0].getY() - 1));} //add lower left corner
                        if (array[0].getY() != 9) {halo.add(new Point(array[0].getX() + 1, array[0].getY() + 1));} //add lower right corner
                    }
                }
             for(int i=0; i< array.length; i++){
                    if(array[0].getY()!=0){ halo.add(new Point(array[i].getX(), array[0].getY()-1));} // add to left
                    if(array[0].getY()!=9){ halo.add(new Point(array[i].getX(), array[0].getY()+1));} // add to right
                }

        }
      //  System.out.println("halo "+halo);
        return halo.toArray(new Point[halo.size()]);
    }


    private void placementOnTheField(Ship ship, Ship ... previousShips) throws IllegalArgumentException{
        for(int i=0; i<ship.array.length; i++) {
            for (Ship s : previousShips) {
                for (Point point : s.array) {
                    if (ship.array[i].equals(point)) throw new IllegalArgumentException("тут уже стоит корабль");
                }
                for (Point halo : s.halo()) {
                    if (ship.array[i].equals(halo)) throw new IllegalArgumentException("новый корабль не должен попадать в ореол существующих кораблей");
                }
            }
        }
    }



    public static Ship [] previousShips(Ship [] ships, int indexShip){
        Ship [] previousShips = new Ship[indexShip];
        for(int i = 0; i< indexShip; i++){
            previousShips[i]=ships[i];
        }
        return previousShips;
    }



}

