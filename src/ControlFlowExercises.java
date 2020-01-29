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
        System.out.printf("%-7d|%-9d|%d\n",i, square, cube);
    }


//    System.out.print("Please enter your grade: ");
//    int number = scanner.nextInt();
//    if(number<=100 && number>=99)
//        System.out.println("A+: 100-99");
//   else if(number<=100 && number>=88)
//        System.out.println("A: 98-88");
//    else if(number<=87 && number>=80)
//        System.out.println("B: 87-80");
//    else if(number<=79 && number>=67)
//        System.out.println("C: 79-67");
//    else if(number<=66 && number>=60)
//    System.out.println("D: 66-60");
//    else if(number<=59 && number>=0)
//        System.out.println("F: 59-0");





    }
}