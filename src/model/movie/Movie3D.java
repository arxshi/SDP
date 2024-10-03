package model.movie;

public class Movie3D implements Movie {

    private final String title;

    public Movie3D(String title) {
        this.title = title;
    }


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getType() {
        return "3D";
    }
}
