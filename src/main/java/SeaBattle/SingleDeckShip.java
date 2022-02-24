package SeaBattle;

public class SingleDeckShip extends Ship{
    public SingleDeckShip(){
        note = "Введи координаты 1-палубного корабля. Формат: x,y";
        coordinates=2;
        direction="однопалубный корабль";
    }

    @Override
    public String toString() {
        return "SingleDeckShip{" + array[0] + '}';
    }
}
