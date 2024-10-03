package model.movie;

public class RegularMovie implements Movie {
    private final String title;

    public RegularMovie(String title) {
         this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getType() {
        return "Regular";
    }
}
