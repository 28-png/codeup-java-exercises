import java.util.Scanner;

public class ConsoleExercises {
public static void main(String[] args) {

//    double pi = 3.14159;
//    System.out.printf("The value of pi is approximately %.2f", pi);

    Scanner scanner = new Scanner(System.in);
//    System.out.print("Enter a number: ");
//    int number = scanner.nextInt();
//    System.out.println("you entered " + number);

//    System.out.print("enter three words: ");
//    String word1 = scanner.next();
//    String word2 = scanner.next();
//    String word3 = scanner.next();
//    System.out.println(word1);
//    System.out.println(word2);
//    System.out.println(word3);

//    System.out.print("enter a sentence: ");
//    String sentence = scanner.nextLine();
//    System.out.println(sentence);


    System.out.print("what is the width of the classroom: ");
    int width = scanner.nextInt();
    System.out.print("What is the length of the classroom: ");
    int length = scanner.nextInt();
    int area = length * width;
    int perimeter = (2 * width) + (2 * width);

    System.out.println("the area of the classroom is: " + area);
    System.out.println("the perimeter of the classroom is: " + perimeter);







    }

}