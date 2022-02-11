package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<Integer, Point> map = new HashMap<>();
        File taxi = new File("/Users/Shuruchka/Documents/GitHub/videocourse/src/main/resources/taxi_cars.txt");
        Scanner scanner = new Scanner(taxi);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String [] taxiPoint = line.split(" ");
            map.put(Integer.parseInt(taxiPoint[0]), new Point(Integer.parseInt(taxiPoint[1]),Integer.parseInt(taxiPoint[2])));
        }
        scanner.close();
      //  System.out.println(map);
        Scanner scanner1= new Scanner(System.in);
        System.out.println("введите 4 числа (координаты первой x1 y1 и второй точки x2 y2 квадрата): ");
        int x1 = scanner1.nextInt();
        int y1 = scanner1.nextInt();
        int x2 = scanner1.nextInt();
        int y2 = scanner1.nextInt();

        int maxX = 0, minX = 0;
        int maxY = 0, minY = 0;

        if(x1<x2){ maxX=x2; minX=x1;
        } else { maxX=x1; minX=x2;}

        if(y1<y2){ maxY=y2; minY=y1;
        } else { maxY=y1; minY=y2;}


        int count = 0;

        for(Map.Entry<Integer, Point> entry: map.entrySet()){
            if(entry.getValue().getX()> minX && entry.getValue().getX()< maxX && entry.getValue().getY()> minY && entry.getValue().getY()< maxY){
                System.out.println("id: "+entry.getKey());
                count++;
            }
        }
        System.out.println("number of car: "+count);
    }
}

