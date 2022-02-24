package SeaBattle;

public class ThreeDeckShip extends Ship{
    public ThreeDeckShip(){
        note = "Введи координаты 3х-палубного корабля. Формат: x,y;x,y;x,y";
        coordinates=6;
    }

    @Override
    public String toString() {
        return "ThreeDeckShip{" + array[0] + ", " + array[1] +", " + array[2] + '}';
    }

}




















//    private int x1, x2;
//    private int y1, y2;
//    private int deck = 4;
//
//
//    public DoubleDeckShip(int x1, int y1, int x2, int y2){
//        this.x1=x1;
//        this.x2=x2;
//        this.y1=y1;
//        this.y2=y2;
//        checkDoubleDeckShip();
//    }
//
//    public int getDeck() {return deck;}
//    public int getX1() {return x1;}
//    public int getX2() {return x2;}
//    public int getY1() {return y1;}
//    public int getY2() {return y2;}
//
//
//
//    public void checkRangeAndValidityOfCoordinates(Ship ship, int deck){
//        try {
//            for(int i=0; i<deck; i++){
//            if(i<0 || i>9) throw new IllegalArgumentException("диапозон введеных координат д/быть от 0 до 9");
//        }
//
//            if (x1 == x2) {
//                if(y2==y1+1 || y2==y1-1){ System.out.println("горизонтальный корабль");
//                }else {throw new IllegalArgumentException("не правильные координаты y2");}
//            } else if (y1 == y2) {
//                if(x2==x1+1 || x2==x1-1){ System.out.println("вертикальный корабль");
//                }else {throw new IllegalArgumentException("не правильные координаты x2");}
//            } else {
//                throw new IllegalArgumentException("не правильные координаты");
//            }
//        }catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public void checkDoubleDeckShip(){
//        try {
//            if(x1<0 || x1>9 || y1<0 || y1>9 || x2<0 || x2>9 || y2<0 || y2>9 ){
//                throw new IllegalArgumentException("диапозон введеных координат д/быть от 0 до 9");
//            }
//            if (x1 == x2) {
//                if(y2==y1+1 || y2==y1-1){ System.out.println("горизонтальный корабль");
//                }else {throw new IllegalArgumentException("не правильные координаты y2");}
//            } else if (y1 == y2) {
//                if(x2==x1+1 || x2==x1-1){ System.out.println("вертикальный корабль");
//                }else {throw new IllegalArgumentException("не правильные координаты x2");}
//            } else {
//                throw new IllegalArgumentException("не правильные координаты");
//            }
//        }catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }
//    }
//
//
//
//
//
//    @Override
//    public String toString() {
//        return "DoubleDeckShip{" +
//                "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + '}';
//    }
//}
