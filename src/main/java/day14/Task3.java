package day14;

import java.io.File;
import static day14.Person.parseFileToObjList;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        parseFileToObjList(file);

    }
}
