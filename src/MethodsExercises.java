import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(add(2, 2));
        System.out.println(sub(3, 9));
        System.out.println(mult(4, 9));
        System.out.println(div(20, 5));
        System.out.println(remainder(10, 3));





    getInteger(1,10);

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


    public static void getInteger(int min, int max) {
    int answer;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        answer = scanner.nextInt();
        do {
            if(answer > max || answer < min)
                System.out.println("that is not a number between 1 and 10");
            System.out.print("Enter a number between 1 and 10: ");
                answer = scanner.nextInt();
        } while(!(answer <= 10) ||  !(answer >=1));
        System.out.println("congrats!");

    }


}