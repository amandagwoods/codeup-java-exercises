package movies;

import util.Input;

public class MoviesApplication {

    static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args){
        Input input = new Input();//adding connection to already created input class
        Movie[] movies = MoviesArray.findAll();

        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n");

        switch (input.getInt(0, 5)){
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("view all movies");
                for(Movie movie : movies){
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            break;
                case 2:
                System.out.println("view movies in animated category");
                    for(Movie movie : movies){
                        if(movie.getCategory().equalsIgnoreCase("animated")){
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
            case 3:
                printMoviesByCategory("drama");
                break;
            case 4:
                printMoviesByCategory("horror");
                break;
            case 5:
                printMoviesByCategory("scifi");
                break;
            default:
        }
    }
    public static void printMoviesByCategory(String category){
        System.out.println("view movies in animated category");
        for(Movie movie : movies){
            if(movie.getCategory().equalsIgnoreCase(category)){
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }
}
