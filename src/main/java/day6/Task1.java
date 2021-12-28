package day6;


public class Task1 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("BMW s1000RR", "blue", 2008);
        Car car1= new Car();
        car1.setModel("Opel Astra");
        car1.setColor("black");
        car1.setYear(2016);
        motorbike1.info();
        System.out.println(motorbike1.yearDifference(2021));
        car1.info();
        System.out.println(car1.yearDifference(2021));


    }
}
