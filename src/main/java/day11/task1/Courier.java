package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;
    public Courier(int salary, boolean isPayed, Warehouse warehouse){
        this.salary=salary;
        this.isPayed=isPayed;
        this.warehouse=warehouse;
    }
    public int getSalary(){return salary;}
    public boolean getIsPayed() { return isPayed;}
    public String toString(){
        return "courier salary "+salary+", bonus has been payed "+isPayed;
    }

    @Override
    public void doWork() {
        salary+=100;
        warehouse.countDeliveredOrders++;
    }

    @Override
    public void bonus() {
        if(warehouse.countDeliveredOrders%10000==0){
            if(isPayed==false){
                salary+=50000;
                isPayed=true;
                System.out.println("бонус "+ 50000);
            } else{
                System.out.println("Бонус уже был выплачен");
            }
        }else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
