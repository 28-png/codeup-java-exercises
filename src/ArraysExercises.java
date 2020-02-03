import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        String[] persons = {"Matt", "John", "Dillan"};
    Person person = new Person(Arrays.toString(persons));
        System.out.println(person);

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        for (String p : persons) {
            System.out.println(p);
        }

    }

}