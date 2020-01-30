import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(add(2, 2));
        System.out.println(sub(3, 9));
        System.out.println(mult(4, 9));
        System.out.println(div(20, 5));
        System.out.println(remainder(10, 3));





    getInteger();

    }


    public static int add(int num, int num2) {
        return num + num2;
    }

    public static int sub(int num, int num2) {
        return num - num2;
    }

    public static int mult(int num, int num2) {
    int total = 0;
    for(int i = 0; i < num2; i++) {
        total += num;
    }
    return total;
    }

    public static int div(int num, int num2) {
        return num / num2;
    }

    public static int remainder(int num, int num2) {
        return num % num2;
    }





    public static void getInteger() {
        int max;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number that can return the highest factorial from 1 being the min: ");
        max = scanner.nextInt();
        int i, answer2 = 1;
        int answer;
        System.out.print("Enter a number between 1 and " + max + ":" + "\n");
        answer = scanner.nextInt();
        do {
            if (answer > max || answer < 1)
                System.out.print("That is not a number between 1 and " + max  + "\n");
           else
               continue;
            System.out.print("Enter a number between 1 and " + max + ":" + "\n");
            answer = scanner.nextInt();
        } while (!(answer <= max) || !(answer >= 1));
        for (i = 1; i <= answer; i++) {
            answer2 = answer2 * i;
        }

        System.out.println(answer + "! = " + answer2);

    }









}