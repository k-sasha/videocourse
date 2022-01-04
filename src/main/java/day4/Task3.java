package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [][] array = new int[12][8];
        Random rand = new Random();
        for(int i=0; i< array.length; i++){
            for (int j=0; j<array[i].length; j++){
                array[i][j]= rand.nextInt(51);
            }
        }
//        for(int [] i: array){
//            for (int j: i){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
        int [] sum = new int[12];
        for(int i=0; i< sum.length && i< array.length; i++) {
            int sumArray=0;
            for(int j=0; j< array[i].length; j++){
                sumArray+=array[i][j];
            }
            sum[i]=sumArray;
//            System.out.println(sum[i]);
        }

//        System.out.println();
//        for(int i: sum){
//            System.out.print(i + " ");
//        }
//        System.out.println();
        int index=0;
        int max=0;
        for (int i =0; i< sum.length; i++){

            if(sum[i]>max || sum[i]==max){
                max=sum[i];
            }else {continue;}
            index=i;
            // System.out.println(i);
        }
        System.out.println(index);
    }
}
