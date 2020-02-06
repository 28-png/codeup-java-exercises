package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication  {



    public static void main(String[] args) {
        Student showAllGrades = new Student("name");
        Scanner scanner = new Scanner(System.in);
        String enterName;
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
        System.out.println();

        Student john = new Student("John");
        john.addGrade(91);
        john.addGrade(94);
        john.addGrade(89);
        john.addGrade(96);
        john.addGrade(100);

        Student pierce = new Student("Pierce");
        pierce.addGrade(91);
        pierce.addGrade(92);
        pierce.addGrade(84);
        pierce.addGrade(90);
        pierce.addGrade(87);

        Student fabio = new Student("Fabio");
        fabio.addGrade(87);
        fabio.addGrade(88);
        fabio.addGrade(82);
        fabio.addGrade(99);
        fabio.addGrade(80);

        do {
            System.out.println("Welcome!\n");
            System.out.println("Here are the GitHub usernames of our students: \n");
            System.out.println("|28-png| |John@Boyega| |Pierce@Guy| |Fabio@Gonzalez|\n");
            System.out.println("To view all grades and averages: 0");
            System.out.println("To view all grades: 1");
            System.out.println("To view a csv report of all students: 2\n");
            System.out.print("What student would you like to see more information on?");
            enterName = scanner.next();

            if(enterName.equals("0"))
                showAllGrades.allGrades();
            else if(enterName.equals("1"))
                showAllGrades.viewGrades();


            if(enterName.equals(students.get("Matt")))
                System.out.println("Name: Matt - Github Username: 28-png \n Current Average: " + matt.getGradeAverage());
           else if(enterName.equals(students.get("John")))
                System.out.println("Name: John - Github Username: John@Boyega \n Current Average: " + john.getGradeAverage());
           else if(enterName.equals(students.get("Pierce")))
                System.out.println("Name: Pierce - Github Username: Pierce@Guy \n Current Average: " + pierce.getGradeAverage());
           else if(enterName.equals(students.get("Fabio")))
               System.out.println("Name: Fabio - Github Username: Fabio@Gonzalez \n Current Average: " + fabio.getGradeAverage());
           else
                System.out.println("Sorry, no student found with the GitHub username of " + enterName + ".\n");
            System.out.print("Would you like to see another student?");
            enterName = scanner.next();
            if(enterName.equals("yes")) {
                continue;
            }
            if (enterName.equals("no")) {
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            }




        } while(!enterName.equals("exit"));

    }



}
