package SeaBattle;

public class DoubleDeckShip extends Ship{
    public DoubleDeckShip(){
        note = "Введи координаты 2х-палубного корабля. Формат: x,y;x,y";
        coordinates=4;
    }

    @Override
    public String toString() {
        return "DoubleDeckShip{" + array[0] + ", " + array[1] +'}';
    }

}
