package grades;

import java.util.HashMap;

public class GradesApplication  {

    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();

        Student matt = new Student("Matt");
        students.put("Matt", "28-png");
        matt.addGrade(90);
        matt.addGrade(100);
        matt.addGrade(70);
        matt.addGrade(80);
        matt.addGrade(88);
        System.out.println(matt.getGradeAverage() + "\n");

        Student john = new Student("John");
        students.put("John", "John@Boyega");
        john.addGrade(91);
        john.addGrade(94);
        john.addGrade(89);
        john.addGrade(96);
        john.addGrade(100);
        System.out.println(john.getGradeAverage() + "\n");

        Student pierce = new Student("Pierce");
        students.put("Pierce", "Pierce@Guy");
        pierce.addGrade(91);
        pierce.addGrade(92);
        pierce.addGrade(84);
        pierce.addGrade(90);
        pierce.addGrade(87);
        System.out.println(john.getGradeAverage() + "\n");

        Student fabio = new Student("Fabio");
        students.put("Fabio", "Fabio@Gonzalez");
        fabio.addGrade(87);
        fabio.addGrade(88);
        fabio.addGrade(82);
        fabio.addGrade(99);
        fabio.addGrade(80);
        System.out.println(john.getGradeAverage());





    }



}
