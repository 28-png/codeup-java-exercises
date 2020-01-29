import java.util.Scanner;

public class Bob {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Say something to Bob: ");
    String something = scanner.next();
    if(something.endsWith("?"))
        System.out.println("sure");
    else if(something.endsWith("!"))
        System.out.println("Whoa, chill out!");
    else
        System.out.println("whatever");



    }

}