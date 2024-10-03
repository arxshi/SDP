package factory.movie;

import model.movie.Movie;
import model.movie.RegularMovie;

public class RegularMovieFactory implements MovieFactory {
    @Override
    public Movie createMovie(String title) {
        return new RegularMovie(title);
    }
}
