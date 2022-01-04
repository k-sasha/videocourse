package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    public Teacher(String name, String subject){
        this.name=name;
        this.subject=subject;
    }
    Random rand = new Random();
   public void evaluate(Student st){
       int grade = rand.nextInt(4)+2;
       String rating;
       switch (grade){
           case 2: rating="неудовлетворительно";break;
           case 3: rating="удовлетворительно";break;
           case 4: rating="хорошо";break;
           default: rating="отлично";
       }
       System.out.println("Преподаватель "+name+" оценил студента с именем "+st.getName()+" по предмету "+subject+" на оценку "+rating+".");
    }
}
