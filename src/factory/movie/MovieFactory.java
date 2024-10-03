package factory.movie;

import model.movie.Movie;

public interface MovieFactory {

    public Movie createMovie(String title);

}
