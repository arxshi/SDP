package factory.movie;

import model.movie.Movie;
import model.movie.Movie3D;

public class Movie3DFactory implements MovieFactory {
    @Override
    public Movie createMovie(String title) {
        return new Movie3D(title);
    }
}
