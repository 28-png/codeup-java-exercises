package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
private String name;
private ArrayList<Integer> grades;
private HashMap<String, String> attendance;
private String date;
private String value;

public Student(String name, String date, String value) {
    this.name = name;
    this.date = date;
    this.value = value;
    this.grades = new ArrayList<>();
    this.attendance = new HashMap<>();
}

    public String getName() {
    return name;
    }

//    public void attendanceOfStudents(String date, String value) {
//        System.out.println(attendance.put(date, value));
//
//    }


    public ArrayList<Integer> getGrades() {
        return this.grades;
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



    public String convertToString(ArrayList<Integer> grades) {
        StringBuilder builder = new StringBuilder();
        for (Integer grade : grades) {
            builder.append(grade);
            builder.append("\n");
        }
        builder.setLength(builder.length() - 1);
        return builder.toString();
    }

    public void viewCsv() {
        Student matt = new Student("Matt", "2017-10-02", "Present");
        matt.addGrade(90);
        matt.addGrade(100);
        matt.addGrade(70);
        matt.addGrade(80);
        matt.addGrade(88);
        Student john = new Student("John", "2017-10-02", "Absent");
        john.addGrade(91);
        john.addGrade(94);
        john.addGrade(89);
        john.addGrade(96);
        john.addGrade(100);
        Student pierce = new Student("Pierce", "2017-10-02", "Absent");
        pierce.addGrade(91);
        pierce.addGrade(92);
        pierce.addGrade(84);
        pierce.addGrade(90);
        pierce.addGrade(87);
        Student fabio = new Student("Fabio", "2017-10-02", "Present");
        fabio.addGrade(87);
       fabio.addGrade(88);
        fabio.addGrade(82);
        fabio.addGrade(99);
        fabio.addGrade(80);
       System.out.println("Name: Matt - Github Username: 28-png \n Current Average: " + matt.getGradeAverage() + " " );
        System.out.println("\nName: John - Github Username: John@Boyega \n Current Average: " + john.getGradeAverage());
        System.out.println("\nName: Pierce - Github Username: Pierce@Guy \n Current Average: " + pierce.getGradeAverage());
        System.out.println("\nName: Fabio - Github Username: Fabio@Gonzalez \n Current Average: " + fabio.getGradeAverage());
    }


    public void viewGrades() {
        Student convertGrades = new Student("Matt", "2017-10-02", "Present");
        Student matt = new Student("Matt", "2017-10-02", "Present");
        matt.addGrade(90);
        matt.addGrade(100);
       matt.addGrade(70);
        matt.addGrade(80);
        matt.addGrade(88);
        System.out.println("Grades: \n" + convertGrades.convertToString(matt.getGrades()));

        Student john = new Student("John", "2017-10-02", "Absent");
        john.addGrade(91);
        john.addGrade(94);
        john.addGrade(89);
        john.addGrade(96);
        john.addGrade(100);
        System.out.println("\nGrades: \n" + convertGrades.convertToString(john.getGrades()));

        Student pierce = new Student("Pierce", "2017-10-02", "Absent");
        pierce.addGrade(91);
        pierce.addGrade(92);
        pierce.addGrade(84);
        pierce.addGrade(90);
        pierce.addGrade(87);
        System.out.println("\nGrades: \n" + convertGrades.convertToString(pierce.getGrades()));

        Student fabio = new Student("Fabio", "2017-10-02", "Present");
        fabio.addGrade(87);
        fabio.addGrade(88);
        fabio.addGrade(82);
        fabio.addGrade(99);
        fabio.addGrade(80);
        System.out.println("\nGrades: \n" + convertGrades.convertToString(fabio.getGrades()));

    }



    public void allGrades() {
        Student convertGrades = new Student("Matt", "2017-10-02", "Present");
        Student matt = new Student("Matt", "2017-10-02", "Present");
        matt.addGrade(90);
       matt.addGrade(100);
        matt.addGrade(70);
        matt.addGrade(80);
        matt.addGrade(88);
        System.out.println("Grades: \n" + convertGrades.convertToString(matt.getGrades()) + "\nAverage:  " + matt.getGradeAverage());

        Student john = new Student("John", "2017-10-02", "Absent");
        john.addGrade(91);
        john.addGrade(94);
        john.addGrade(89);
        john.addGrade(96);
        john.addGrade(100);
        System.out.println("\nGrades: \n" + convertGrades.convertToString(john.getGrades()) + "\nAverage:  " + john.getGradeAverage());

        Student pierce = new Student("Pierce", "2017-10-02", "Absent");
        pierce.addGrade(91);
        pierce.addGrade(92);
        pierce.addGrade(84);
        pierce.addGrade(90);
        pierce.addGrade(87);
        System.out.println("\nGrades: \n" + convertGrades.convertToString(pierce.getGrades()) + "\nAverage:  " + pierce.getGradeAverage());

        Student fabio = new Student("Fabio", "2017-10-02", "Present");
        fabio.addGrade(87);
        fabio.addGrade(88);
        fabio.addGrade(82);
        fabio.addGrade(99);
        fabio.addGrade(80);
        System.out.println("\nGrades: \n" + convertGrades.convertToString(fabio.getGrades()) + "\nAverage:  " + fabio.getGradeAverage());
    }







}