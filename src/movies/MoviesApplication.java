package movies;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    final static String[] categories = {"none", "all", "animated", "drama", "horror", "scifi", "musical", "comedy"};
    public static void main(String[] args) {

        Movie[] list = MoviesArray.findAll();
        Scanner scanner = new Scanner(System.in);

        int choice = 1;
        do {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("\t0 - exit");
            System.out.println("\t1 - view all movies");
            System.out.println("\t2 - view movies in the animated category");
            System.out.println("\t3 - view movies in the drama category");
            System.out.println("\t4 - view movies in the horror category");
            System.out.println("\t5 - view movies in the scifi category");
            System.out.println("\t6 - view movies in the musical category");
            System.out.println("\t7 - view movies in the comedy category");
            System.out.println("");
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfe) {
               break;
            }

            if (choice != 0 && choice != 8) {
                for (Movie movie : list) {
                    switch (choice) {
                        case 1:
                            System.out.printf("%s -- %S\n", movie.getName(), movie.getCategories());
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            if (movie.getCategories().equalsIgnoreCase(categories[choice])) {
                                System.out.printf("%s -- %S\n", movie.getName(), movie.getCategories());
                            }
                            break;
                        default:
                            break;
                    }
                }
            }


        } while(choice != 0);

    }


}