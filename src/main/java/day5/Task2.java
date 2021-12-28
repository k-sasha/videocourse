package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1= new Motorbike("BMW s1000RR", "blue", 2008);
        System.out.println(motorbike1.getColor() +" "+motorbike1.getModel()+", "+ motorbike1.getYear());

    }
}

class Motorbike{
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year){
        this.model=model;
        this.color=color;
        this.year=year;
    }

    public String getModel(){return model;}
    public String getColor(){return color;}
    public int getYear(){return year;}
}
