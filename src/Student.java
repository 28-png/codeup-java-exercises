import javax.naming.ldap.LdapName;
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
        matt.cohort = "Europa";
        matt.startDate = new Date("06/11/2018");
        matt.program = "Web Development";
        matt.location = "San Antonio";
        matt.drinksCoffee = true;
        System.out.println(matt.report());

       Student zach = new Student();
        zach.name = "Zach";
        zach.cohort = "Bayes";
        zach.startDate = new Date("February 11, 2017");
        zach.program = "Data Science";
        zach.location = "San Antonio";
        zach.drinksCoffee = false;
        System.out.println(zach.report());

    }

    public String report() {
        String output = "";
        output += "My name is " + this.name + ". ";
        output += "I started learning " + this.program + " with " + this.cohort + " on " + this.startDate + ". ";
       if(this.drinksCoffee)
           output += "I drink coffee in " + this.location + ". ";
       else
           output += "I dont drink coffee in " + this.location + ".";
       return output;
    }


}