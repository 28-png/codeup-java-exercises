package grades;

import java.util.HashMap;

public class GradesApplication  {

    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        students.put("Matt", "28-png");
        students.put("John", "John@Boyega");
        students.put("Pierce", "Pierce@Guy");
        students.put("Fabio", "Fabio@Gonzalez");

        Student matt = new Student("Matt");
        matt.addGrade(90);
        matt.addGrade(100);
        matt.addGrade(70);
        matt.addGrade(80);
        matt.addGrade(88);
//        System.out.println(matt.getGradeAverage() + "\n");

        Student john = new Student("John");
        john.addGrade(91);
        john.addGrade(94);
        john.addGrade(89);
        john.addGrade(96);
        john.addGrade(100);
//        System.out.println(john.getGradeAverage() + "\n");

        Student pierce = new Student("Pierce");
        pierce.addGrade(91);
        pierce.addGrade(92);
        pierce.addGrade(84);
        pierce.addGrade(90);
        pierce.addGrade(87);
//        System.out.println(john.getGradeAverage() + "\n");

        Student fabio = new Student("Fabio");
        fabio.addGrade(87);
        fabio.addGrade(88);
        fabio.addGrade(82);
        fabio.addGrade(99);
        fabio.addGrade(80);
//        System.out.println(john.getGradeAverage());


        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students: \n");
        System.out.println("|28-png| |John@Boyega| |Pierce@Guy| |Fabio@Gonzalez|\n");




    }



}
