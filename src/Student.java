import java.util.Date;

public class Student {
    String name;
    String cohort;
    Date startDate;
    String program;
    String location;
    boolean drinksCoffee;

    public static void main(String[] args) {
    Student matt = new Student();
        matt.name = "Matt";

        Student zach = new Student();
        zach.name = "Zach";
        zach.drinksCoffee = false;

        System.out.println(matt.name);
        if(zach.drinksCoffee)
        System.out.println(zach.name + " drinks coffee");

    }


}