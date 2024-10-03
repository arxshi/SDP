package model.schedule;

import model.movie.Movie;

public class MovieSchedule implements Schedule {

    private Movie movie;
    private String time;

    public MovieSchedule(Movie movie, String time) {
        this.movie = movie;
        this.time = time;
    }

    public MovieSchedule(String time) {
        this.time = time;
    }

    public MovieSchedule() {
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String getTime() {
        return time;
    }

    @Override
    public Schedule clone() {
        return new MovieSchedule();
    }
}

