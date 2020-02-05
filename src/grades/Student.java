package grades;

import java.util.ArrayList;

public class Student {
private String name;
private ArrayList<Integer> grades;

public Student(String name, int grades) {
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
    for(int i =0; i < grades.size(); i++) {
        total = total += grades.indexOf(i);
    }
    double average = total / grades.size();
    return average;

    }

    public static void main(String[] args) {






    }



}