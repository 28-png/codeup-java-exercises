package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
    MoviesArray list = new MoviesArray();
    Movie movie = new Movie("name", "categories");
        Scanner scanner = new Scanner(System.in);
        String viewList;
        System.out.println("What would you like to do?");

        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - View movies in the horror category");
        System.out.println("5 - View movies in the Scifi category");

        System.out.println("Enter your choice: ");
        viewList = scanner.next();




    }


}