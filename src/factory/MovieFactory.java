package factory;

import model.movie.Movie;

public interface MovieFactory {

    public Movie createMovie(String title);

}
