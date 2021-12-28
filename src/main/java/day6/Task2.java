package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("боинг", 2010, 50000,60000);
        airplane1.setYear(2012);
        airplane1.setLength(55000);
        airplane1.fillUp(4000);
        airplane1.info();
    }
}


