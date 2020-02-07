package util;

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
    int answer;
    do {
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        answer = this.scanner.nextInt();
        try {
            Integer.valueOf(answer = this.scanner.nextInt());
            System.out.println("It successfully parsed");
        } catch(NumberFormatException e) {
            System.out.println("It cannot parse");
            e.printStackTrace();
        }
    }while(answer < min || answer > max);
        return answer;

}

public int getInt() {
    int answer;
    System.out.println("Enter a number: ");
    answer = this.scanner.nextInt();
    return answer;
}

public double getDouble(double min, double max) {
    double answer;
    do {
            System.out.println("Enter a number between " + min + " and " + max + ": ");
        answer = this.scanner.nextDouble();
        try {
           Double.valueOf(answer = this.scanner.nextDouble());
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



}
