import java.util.Random;
import java.util.Scanner;

public class ServerNameGenerator {



    public static void main(String[] args) {
    String[] nouns = {"people", "history", "art", "way", "world", "information", "map", "government", "thanks", "year"};
    String[] adjectives = {"attractive", "bald", "beautiful", "chubby", "clean", "dazzling", "elegant", "drab", "calm", "brave"};

        Random r=new Random();
        int randomNumber=r.nextInt(nouns.length);
        int randomNumber2=r.nextInt(adjectives.length);
        System.out.println(nouns[randomNumber] + "-" + adjectives[randomNumber2]);





    }



    }

