package SeaBattle;

public class FourDeckShip extends Ship{
    public FourDeckShip(){
        note = "Введи координаты 4х-палубного корабля. Формат: x,y;x,y;x,y;x,y";
        coordinates=8;
    }

    @Override
    public String toString() {
        return "FourDeckShip{" + array[0] + ", " + array[1] +", " + array[2] +", " + array[3] + '}';
    }
}
