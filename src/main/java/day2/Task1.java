package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //System.out.println("Введити количество этажей: ");
        int count = s.nextInt();
        if(count > 0 && count<5){
            System.out.println("Малоэтажный дом");
        } else if (count >4 && count< 9){
            System.out.println("Среднеэтажный дом");
        } else if (count >8 ){
            System.out.println("Многоэтажный дом");
        } else if(count<1){
            System.out.println("Ошибка ввода");
        }


    }
}
