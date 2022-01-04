package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("boeing 737", 2007, 40000,60000);
        Airplane a2 = new Airplane("boeing 777", 2010, 63000,60000);
        Airplane.compareAirplanes(a1,a2);

    }
}