package day9.Task2;

public class Triangle extends Figure{
    private int l1;
    private int l2;
    private int l3;
   public Triangle(int l1, int l2, int l3, String color){
       super(color);
       this.l1=l1;
       this.l2=l2;
       this.l3=l3;
   }

    @Override
    public double area() {
       int p=(l1+l2+l3)/2;
       int d= p*(p-l1)*(p-l2)*(p-l3);
        return Math.sqrt(d);
    }

    @Override
    public double perimeter() {
        return l1+l2+l3;
    }
}
