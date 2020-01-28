import java.util.Scanner;

public class ControlFlowExercises {
public static void main(String[] args) {
//int i = 5;
//while(i <= 15) {
//    System.out.println(i++);
//
//}

//int num = 0;
//do {
//    System.out.println(num);
//    num+=2;
//} while(num <= 100);


//long num = 2;
//do {
//    System.out.println(num);
//    num*=num;
//} while(num <= 1_000_000);

//for(long num = 2; num <= 1_000_000; num*=num) {
//    System.out.println(num);
//}
//
//    for (int num = 0; num <= 100; num++) {
//        if (num % 5 == 0 && num % 3 == 0)
//            System.out.println("FizzBuzz");
//        else if (num % 5 == 0)
//            System.out.println("Fizz");
//        else if (num % 3 == 0)
//            System.out.println("Buzz");
//        else
//            System.out.println(num);
//
//
//    }

    Scanner scanner = new Scanner(System.in);

    int number, cube, square;
    System.out.print("What number would you like to go up to? ");
    number = scanner.nextInt();
        System.out.println("number | squared | cubed");
        System.out.println("-------|---------|-------");
    for(int i = 1; i <= number; i++) {
        square = i * i;
        cube = i * square;
        System.out.println(i+ "      |" +square+ "       |" + cube);
    }







    }
}