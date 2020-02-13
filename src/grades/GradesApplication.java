package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication  {



    public static void main(String[] args) {
        IndividualStudents individualStudents = new IndividualStudents();
        Student showAllGrades = new Student("name", "date", "value");
        Scanner scanner = new Scanner(System.in);
        String enterName;
        HashMap<String, String> students = new HashMap<>();
        students.put("Matt", "28-png");
        students.put("John", "John@Boyega");
        students.put("Pierce", "Pierce@Guy");
        students.put("Fabio", "Fabio@Gonzalez");


        do {
            System.out.println("Welcome!\n");
            System.out.println("Here are the GitHub usernames of our students: \n");
            System.out.println("|28-png| |John@Boyega| |Pierce@Guy| |Fabio@Gonzalez|\n");
            System.out.println("To view all grades and averages: 0");
            System.out.println("To view all grades: 1");
            System.out.println("To view a csv report of all students: 2\n");
            System.out.println("To exit: exit\n");
            System.out.print("What student would you like to see more information on?");
            enterName = scanner.next();

            if(enterName.equals("0"))
                showAllGrades.allGrades();

            else if(enterName.equals("1"))
                showAllGrades.viewGrades();

            else if(enterName.equals("2"))
                showAllGrades.viewCsv();

            else if(enterName.equals(students.get("Matt")))
               individualStudents.studentMatt();

           else if(enterName.equals(students.get("John")))
               individualStudents.studentJohn();

           else if(enterName.equals(students.get("Pierce")))
                individualStudents.studentPierce();

           else if(enterName.equals(students.get("Fabio")))
               individualStudents.studentFabio();
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
