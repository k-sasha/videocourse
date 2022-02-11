package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("/Users/Shuruchka/Documents/GitHub/videocourse/src/main/resources/dushi.txt");

        Scanner scanner = new Scanner(text); // в text находится файл dushi.txt
        scanner.useDelimiter("[.,:;()?!\"\\s–]+");

        Map<String,Integer> map = new HashMap<>();

        while (scanner.hasNext()) {
            String s = scanner.next();
            if(!map.containsKey(s)){
                map.put(s, 1);
            } else {
                int i = map.get(s).intValue();
                map.put(s, ++i);
            }
        }

        Map <String, Integer> map2 = new HashMap<>();
        int count = 0;

        while(count<100){  // я пыталась придумать, чтоб не было цикла в цикле, но это единственное, что приходит на ум
        int max = 0;
        String word = null;
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()> max){
                max = entry.getValue();
                word = entry.getKey();
            }
        }
        map2.put(word,max);
        map.remove(word,max);
        count++;
        }

        for(Map.Entry<String,Integer> entry: map2.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        //Чичиков 601









    }
}
