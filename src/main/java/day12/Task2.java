package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<351; i=i+2){
            if (i==32){
                i=300;
            }
            list.add(i);
        }
        System.out.println(list);
    }
}
