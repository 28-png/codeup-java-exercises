package grades;

import java.util.ArrayList;

public class Student {
private String name;
private ArrayList<Integer> grades;

public Student(String name) {
    this.name = name;
    this.grades = new ArrayList<>();
}

    public String getName() {
    return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);

    }

    public double getGradeAverage() {
    double total = 0;
    for(Integer grade : grades) {
        total += grade;
    }
    return total / grades.size();
    }

    public static void main(String[] args) {
    Student matt = new Student("Matt");
        matt.addGrade(90);
        matt.addGrade(100);
        matt.addGrade(70);
        matt.addGrade(80);
        matt.addGrade(88);
    System.out.println(matt.getGradeAverage());

    Student john = new Student("John");
        john.addGrade(91);
        john.addGrade(94);
        john.addGrade(89);
        john.addGrade(96);
        john.addGrade(100);
       System.out.println(john.getGradeAverage());

       Student pierce = new Student("Pierce");
        pierce.addGrade(91);
        pierce.addGrade(92);
        pierce.addGrade(84);
        pierce.addGrade(90);
        pierce.addGrade(87);
        System.out.println(john.getGradeAverage());

        Student fabio = new Student("Fabio");
        fabio.addGrade(87);
        fabio.addGrade(88);
        fabio.addGrade(82);
        fabio.addGrade(99);
        fabio.addGrade(80);
        System.out.println(john.getGradeAverage());



    }



}