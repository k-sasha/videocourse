package day6;

public class Airplane {
    private String manufacturer; //(изготовитель)
    private int year; //(год выпуска)
    private int length;
    private int weight;
    private int fuel=0; // (количество топлива в баке)

    public void setManufacturer(String manufacturer){ this.manufacturer=manufacturer;}
    public void setYear(int year){ this.year=year;}
    public void setLength(int length){ this.length=length;}
    public void setWeight(int weight){ this.weight=weight;}
    public void setFuel(int fuel){ this.fuel=fuel;}
    public int getFuel(){return fuel;}
    public void info(){
        System.out.println("Изготовитель: "+manufacturer+", год выпуска: "+year+", длина: "+length+", вес: "+weight+", количество топлива в баке: "+fuel);
    }

    public Airplane(String manufacturer, int year, int length, int weight){
        this.manufacturer=manufacturer;
        this.year=year;
        this.length=length;
        this.weight=weight;
        info();
    }
    public int fillUp(int n){
        return fuel+=n;
    }
}
