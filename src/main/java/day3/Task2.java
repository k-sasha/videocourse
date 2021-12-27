package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true) {
           // System.out.println("Введите два числа через пробел: ");
            double a = s.nextDouble(); //делимое
            double b = s.nextDouble(); //делитель
            if (b==0){break;}
            double result = a / b;
            System.out.println(result);
        }
       // System.out.println("работа программы завершается");
    }
}
