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
        for (int i =0; i< array.length-3; i++){
            int sum1=array[i]+array[i+1]+array[i+2];
            int sum2=array[i+1]+array[i+2]+array[i+3];
            if(sum1>max || sum2>max){if(sum1>sum2){
                max=sum1;
                index=i;
            }else if(sum1<sum2){
                max=sum2;
                index=i+1;
            }else {
                System.out.println("суммы соседних трех чисел равны");
            }}

        }
        System.out.println(max);
        System.out.println(index);


    }
}
