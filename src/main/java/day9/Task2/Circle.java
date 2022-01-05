package day9.Task2;

public class Circle extends Figure{
    private int r;
    public Circle(int r, String color){
        super(color);
        this.r=r;
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*r;
    }
}
