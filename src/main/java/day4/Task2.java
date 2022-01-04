package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int [] array = new int[100];
        Random rand = new Random();
        for(int i=0; i<array.length; i++){
            array[i]= rand.nextInt(10001);
        }
        int max=0;
        int min=0;
        int count=0;
        int sum=0;

        for(int i: array){
            if(i> max){
                max = i;
            }
            if(i<min){
                min=i;
            }
            if(i%10==0){
                count++;
                sum+=i;
            }
        }
        System.out.println("наибольший элемент массива "+max);
        System.out.println("наименьший элемент массива "+min);
        System.out.println("количество элементов массива, оканчивающихся на 0 "+count);
        System.out.println("сумму элементов массива, оканчивающихся на 0 "+sum);

    }
}
