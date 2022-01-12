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

        int maxSum=0;
        int indexMax=0;
        for(int i=0; i<array.length; i++){
            int sumLine=0;
            for(int j=0; j<array[i].length; j++){
                sumLine+=array[i][j];
            }
//            System.out.println("sumLine = "+ sumLine);
            if(sumLine>=maxSum){
                maxSum=sumLine;
                indexMax=i;
//                System.out.println("index became "+ indexMax);
            }
        }
        System.out.println(indexMax);
    }
}
