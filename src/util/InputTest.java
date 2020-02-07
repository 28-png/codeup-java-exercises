package util;

public class InputTest {
    public static void main(String[] args) {
    Input input = new Input();
        System.out.println(input.getString());
        System.out.println(input.yesNo());
        try {
            System.out.println(input.getInt(1, 10));
        } catch(NumberFormatException e) {
            System.out.println("you cannot parse");
            e.printStackTrace();
        }


        System.out.println(input.getDouble(10.25, 20.25));
    }

}