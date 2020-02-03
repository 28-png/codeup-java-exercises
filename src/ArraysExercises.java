import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {
    String[] persons = {"Matt", "John", "Dillan"};




    public static void addPerson(String[] arrName, String name) {
        String[] newArray = new String[arrName.length +1];
        System.arraycopy(arrName, 0, newArray, 0, arrName.length);
        newArray[newArray.length -1] = name;
        System.out.println(Arrays.toString(newArray));
        for (String s : newArray) {
            System.out.println(s);
        }

    }




    public static void main(String[] args) {
        String[] persons = {"Matt", "John", "Dillan"};
        Person person = new Person(Arrays.toString(persons));
        System.out.println(person.getName());
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        for (String p : persons) {
            System.out.println(p);
        }

    addPerson(persons, "Fred");


    }





}