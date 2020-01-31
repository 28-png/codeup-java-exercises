public class ProgrammingPushups {
public static void main(String[] args) {
    System.out.println(multiply(7, 8));

    }

    public static int multiply(int a, int b) {
        int total = 0;
        for(int i = 0; i < b; i++) {
            total += a;
        }
        return total;

    }




}