package grades;

import java.util.ArrayList;

public class IndividualStudents  {

    public void studentMatt() {
        Student matt = new Student("Matt");
        matt.addGrade(90);
        matt.addGrade(100);
        matt.addGrade(70);
        matt.addGrade(80);
        matt.addGrade(88);
        System.out.println("Name: Matt - Github Username: 28-png \n Current Average: " + matt.getGradeAverage());
    }

    public void studentJohn() {
        Student john = new Student("John");
        john.addGrade(91);
        john.addGrade(94);
        john.addGrade(89);
        john.addGrade(96);
        john.addGrade(100);
        System.out.println("Name: John - Github Username: John@Boyega \n Current Average: " + john.getGradeAverage());
    }


    public void studentPierce() {
        Student pierce = new Student("Pierce");
        pierce.addGrade(91);
        pierce.addGrade(92);
        pierce.addGrade(84);
        pierce.addGrade(90);
        pierce.addGrade(87);
        System.out.println("Name: Pierce - Github Username: Pierce@Guy \n Current Average: " + pierce.getGradeAverage());
    }

    public void studentFabio() {
        Student fabio = new Student("Fabio");
        fabio.addGrade(87);
        fabio.addGrade(88);
        fabio.addGrade(82);
        fabio.addGrade(99);
        fabio.addGrade(80);
        System.out.println("Name: Fabio - Github Username: Fabio@Gonzalez \n Current Average: " + fabio.getGradeAverage());
    }

}
