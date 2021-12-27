package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;

        while (i<5) {
            //System.out.println("ВВедите два числа: ");
            double a = s.nextDouble(); //делимое
            double b = s.nextDouble(); //делитель
            i++;
            if(b==0){
                System.out.println("Деление на 0");
                continue;
            }
            double result = a/b;
            System.out.println(result);
        }
        //System.out.println("программа завершена");
    }
}
