package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse= new Warehouse();
        Picker picker=new Picker(0,false, warehouse);
        Courier courier= new Courier(0,false, warehouse);
        businessProcess(picker);
        businessProcess(courier);
        System.out.println(warehouse.toString());
        System.out.println("---------------------");
        Warehouse warehouse2= new Warehouse();
        Picker picker2=new Picker(0,false, warehouse2);
        Courier courier2= new Courier(0,false, warehouse2);
        businessProcess(picker2);
        businessProcess(courier2);
        System.out.println(warehouse2.toString());
        System.out.println("---------------------");
        System.out.println(warehouse.toString());
        System.out.println(picker.getSalary());
        System.out.println(courier.getSalary());
    }
    static void businessProcess(Worker worker){
        int i =0;
        while(i<10000){
        worker.doWork();
        i++;
        }
        System.out.println(worker.toString());
        worker.bonus();
        System.out.println(worker.toString());
    }
}
