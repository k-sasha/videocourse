package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void bolche8(int [] array){
        int summa=0;
        for (int i: array){
            if (i>8){
                summa++;
            } else {continue;}
        }
        System.out.println("Количество чисел больше 8: " + summa);
    }

    public static void ravno1(int [] array){
        int summa=0;
        for (int i: array){
            if (i==1){
                summa++;
            } else {continue;}
        }
        System.out.println("Количество чисел равных 1: " + summa);
    }

    public static void chetnieInet(int [] array){
        int summa=0;
        int sum=0;
        for (int i: array){
            if (i%2==0){
                summa++;
            } else {sum++;}
        }
        System.out.println("Количество четных чисел: " + summa);
        System.out.println("Количество нечетных чисел: " + sum);
    }

    public static void summaArray(int [] array){
        int summa=0;
        for (int i: array){
            summa+=i;
        }
        System.out.println("Сумма всех элементов массива: " + summa);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lenght = s.nextInt();
         int [] array = new int[lenght];

         Random random = new Random();

         for (int i=0; i< array.length; i++){
             array[i] = random.nextInt(10);
         }

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + lenght);
        bolche8(array);
        ravno1(array);
        chetnieInet(array);
        summaArray(array);



        System.out.println();

    }
}
