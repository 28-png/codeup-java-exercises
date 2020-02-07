package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
private Scanner scanner;

public Input() {
    this.scanner = new Scanner(System.in);
}

public String getString() {
String answer;
    System.out.println("Enter a string: ");
    answer = this.scanner.next();
    return answer;
}

public boolean yesNo() {
String answer;
    System.out.println("Enter yes or no");
    answer = this.scanner.next();
    return answer.toLowerCase().startsWith("y");

}

public int getInt(int min, int max) {
    int answer = 0;
    do {
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        try {
            answer = Integer.valueOf(this.scanner.next());
            System.out.println("It successfully parsed");
            } catch(NumberFormatException e) {
                System.out.println("It cannot parse");
                 e.printStackTrace();
             }
        } while(answer < min || answer > max);
        return answer;
}

public int getInt() {
    int answer;
    System.out.println("Enter a number: ");
    answer = this.scanner.nextInt();
    return answer;
}

public double getDouble(double min, double max) {
    double answer = 0;
    do {
            System.out.println("Enter a number between " + min + " and " + max + ": ");
       try {
           answer = Double.valueOf(this.scanner.next());
            System.out.println("it has successfully parsed");
       } catch(NumberFormatException e) {
            System.out.println("Cannot parse");
            e.printStackTrace();
        }
    }while(answer < min || answer > max);
    return answer;
}

public double getDouble() {
    double answer;
    System.out.println("Enter a number: ");
    answer = this.scanner.nextDouble();
    return answer;
}


public int getBinary() {
    int answer = 0;
    do {
        System.out.print("Enter a Binary number: ");
        try {
            answer = Integer.valueOf(scanner.next(), 2);
            System.out.println(answer);
            System.out.println("Successfully parsed!");
        } catch (NumberFormatException e) {
            System.out.println("Cannot parse!");
            e.printStackTrace();
        }
    } while(answer != 0);
    return answer;
}

public int getHex() {
    int answer = 0;
    do {
        System.out.println("Enter a Hexadecimal number: ");
        try {
            answer = Integer.parseInt(scanner.next(), 16);
            System.out.println(answer);
            System.out.println("Successfully parsed!");
        } catch (NumberFormatException e) {
            System.out.println("Cannot Parse!");
            e.printStackTrace();
        }
    } while(answer != 0);
    return answer;
    }



}
