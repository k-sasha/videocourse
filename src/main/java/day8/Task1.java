package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); //сохраняем время перед запуском блока кода
        String sAll="";
for (int i=0; i<20000; i++){
        sAll =sAll+i+" ";
}
        System.out.println(sAll);
        long stopTime = System.currentTimeMillis(); //сохраняем время после того, как код отработал
        System.out.println("Длительность работы, в мс.:" + (stopTime - startTime));

        long startTime2 = System.currentTimeMillis(); //сохраняем время перед запуском блока кода
        StringBuilder sbAll= new StringBuilder();
for (int i=0; i<20000; i++){
    sbAll.append(i+" ");
}
        System.out.println(sbAll);
        long stopTime2 = System.currentTimeMillis(); //сохраняем время после того, как код отработал
        System.out.println("Длительность работы, в мс.:" + (stopTime2 - startTime2));
    }
}
