package day8;

public class Airplane {
    private String manufacturer; //(изготовитель)
    private int year; //(год выпуска)
    private int length;
    private int weight;
    private int fuel; // (количество топлива в баке)

    public String toString(){
        return "Изготовитель: "+manufacturer+", год выпуска: "+year+", длина: "+length+", вес: "+weight+", количество топлива в баке: "+fuel;
    }

    public Airplane(String manufacturer, int year, int length, int weight){
        this.manufacturer=manufacturer;
        this.year=year;
        this.length=length;
        this.weight=weight;
    }
}
