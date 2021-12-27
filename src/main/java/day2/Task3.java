package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //System.out.println("Введите два числа через пробел: ");
        int a = s.nextInt();
        int b = s.nextInt();

        if (a>=b){
            System.out.println("Некорректный ввод");
        }
        int count = a+1;
        while (count<b){
            if(count%5==0 && count%10!=0){
                System.out.print(count+" ");
            }
            count++;
        }

    }
}
