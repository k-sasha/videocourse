package day9.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("введите название учебной группы у объекта-студента:");
        String group= scan.nextLine();
        System.out.println("введите название предмета у объекта-преподавателя:");
        String subject= scan.nextLine();
        Student student=new Student("Petr", group);
        Teacher teacher=new Teacher("Alla",subject);
        student.printInfo();
        teacher.printInfo();
        scan.close();
    }
}
