package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Ivan Petrovich","math");
        Student student1 = new Student("Roman");
        teacher1.evaluate(student1);
    }
}
