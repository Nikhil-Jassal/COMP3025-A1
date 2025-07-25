package ca.georgian.assignment1.model;

public class Item {
    private String movieTitle;
    private String movieStudio;
    private String movieRating;
    private String movieYear;

    // Constructor
    public Item(String movieTitle, String movieStudio, String movieRating, String movieYear) {
        this.movieTitle = movieTitle;
        this.movieStudio = movieStudio;
        this.movieRating = movieRating;
        this.movieYear = movieYear;
    }

    // Getters and Setters
    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieStudio() {
        return movieStudio;
    }

    public void setMovieStudio(String movieStudio) {
        this.movieStudio = movieStudio;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }

    public String getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(String movieYear) {
        this.movieYear = movieYear;
    }
}
