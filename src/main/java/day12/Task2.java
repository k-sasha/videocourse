package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<351; i=i+2){
            if(i<31 || i>299){
            list.add(i);}
        }
        System.out.println(list);
    }
}
