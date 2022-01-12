package day11.task1;

public class Picker implements Worker{
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;
    public Picker(int salary, boolean isPayed, Warehouse warehouse){
        this.salary=salary;
        this.isPayed=isPayed;
        this.warehouse=warehouse;
    }
    public int getSalary(){return salary;}
    public boolean getIsPayed() { return isPayed;}
    public String toString(){
        return "picker salary "+salary+", bonus has been payed "+isPayed;
    }

    @Override
    public void doWork() {
        salary+=80;
        warehouse.increaseCountPickedOrders();
    }

    @Override
    public void bonus() {
        if(warehouse.getCountPickedOrders()%10000==0){
            if(isPayed==false ){
            salary+=70000;
            isPayed=true;
                System.out.println("бонус "+ 70000);}
            else{
                System.out.println("Бонус уже был выплачен");
            }
        }else {
            System.out.println("Бонус пока не доступен");
        }

    }
}
