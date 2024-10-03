package factory;

import model.movie.IMaxMovie;
import model.movie.Movie;

public class IMaxMovieFactory implements MovieFactory {
    @Override
    public Movie createMovie(String title) {
        return new IMaxMovie(title);
    }
}
