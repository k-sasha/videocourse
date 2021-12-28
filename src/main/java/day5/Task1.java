package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1= new Car();
        car1.setModel("Opel Astra");
        car1.setColor("black");
        car1.setYear(2016);
        System.out.println("model is: " + car1.getModel()+", color: "+car1.getColor()+", year: "+car1.getYear());

    }
}

class Car{
    private String model;
    private String color;
    private int year;

    public void setModel(String model){this.model=model;}
    public String getModel(){return model;}

    public void setColor(String color){this.color=color;}
    public String getColor(){return color;}

    public void setYear(int year){this.year=year;}
    public int getYear(){return year;}
}
