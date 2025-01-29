package doublylinkedlist.moviemanagementsystem;

public class Main {
    public static void main(String[] args) {
        MovieManagement movieList = new MovieManagement();

        movieList.addMovieAtBeginning("Puspa2", "Skumar", 2024, 9.0);
        movieList.addMovieAtEnd("Lucky Bhaskar", "\n" + "Venky Atluri", 2024, 8.0);
        movieList.addMovieAtPosition("Leo", "\n" + "Lokesh Kanagraj", 2023, 8.6, 1);

        // Displaying movies in forward and backward order
        System.out.println("Movies in forward order:");
        movieList.displayMoviesForward();

        // Displaying movies in forward and backward order
        System.out.println("Movies in backward order:");
        movieList.displayMoviesBackward();

        // Searching for movies by rating and director
        System.out.println("Searching for movies by Skumar:");
        movieList.searchMovieByDirector("Skumar");

        // Searching for movies by rating and director
        System.out.println("Updating rating for Leo:");
        movieList.updateMovieRating("Leo", 7.8);
        movieList.displayMoviesForward();

        // Removing a movie from the list
        System.out.println("Removing Pushpa2:");
        movieList.removeMovieByTitle("Pushpa2");

        // Displaying movies in forward order after removing a movie
        movieList.displayMoviesForward();

    }
}
