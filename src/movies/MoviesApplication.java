package movies;

import util.Input;

public class MoviesApplication {

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
            default:
        }
    }
}
