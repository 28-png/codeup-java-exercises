import java.util.Scanner;

public class HighLow {
public static void main(String[] args) {


gameHighLow();


    }

public static void gameHighLow() {
    String continueOn;
    int answer;
    int finalAnswer = (int) (Math.random() * 100 + 1);
    do {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100: \n");
        answer = scanner.nextInt();
        if (answer > finalAnswer)
           System.out.println("LOWER");
     else if (answer < finalAnswer)
            System.out.println("HIGHER");
        else
            System.out.println("GOOD GUESS!");
    System.out.print("Would you like to try again? \n");
  continueOn = scanner.next();
    }while(!continueOn.equals("no"));
}


}