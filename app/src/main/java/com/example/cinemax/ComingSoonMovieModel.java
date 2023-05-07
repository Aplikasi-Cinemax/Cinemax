package com.example.cinemax;

public class ComingSoonMovieModel {
    private String movieName;
    private String movieSubName;
    private int movieImage;
    private String releaseDate;

    public ComingSoonMovieModel(String movieName, String movieSubName, int movieImage, String releaseDate) {
        this.movieName = movieName;
        this.movieSubName = movieSubName;
        this.movieImage = movieImage;
        this.releaseDate = releaseDate;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieSubName() {
        return movieSubName;
    }

    public int getMovieImage() {
        return movieImage;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
