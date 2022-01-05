package day9.Task2;

public class Rectangle extends Figure{
    private int b; //width
    private int h; //height
    public Rectangle(int b, int h, String color){
        super(color);
        this.b=b;
        this.h=h;
    }

    @Override
    public double area() {
        return b*h;
    }

    @Override
    public double perimeter() {
        return 2*(b+h);
    }
}
