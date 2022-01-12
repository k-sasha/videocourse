package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int [] array = new int[100];
        Random rand = new Random();
        for(int i=0; i< array.length;i++){
            array[i]= rand.nextInt(10001);
        }

        int max=0;
        int index=0;
        int n=3; // кол-во эл-ов для суммирования
        for (int i =0; i< array.length-n; i++){
            int j=0;
            int sumN=0; //сумма n эл-ов
            int sumNextN=0; // сумма следующих n эл-ов
            while(j<n){
                sumN+=array[i+j];
                sumNextN+=array[i+1+j];
                j++;
            }
            if(sumN>max || sumNextN>max){if(sumN>sumNextN){
                max=sumN;
                index=i;
            }else if(sumN<sumNextN){
                max=sumNextN;
                index=i+1;
            }else {
                System.out.println("суммы соседних трех чисел равны");
            }}

        }
        System.out.println(max);
        System.out.println(index);
    }
}
