package model.movie;

public class IMaxMovie implements Movie {

    private final String title;
    public IMaxMovie(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getType() {
        return "IMax";
    }
}
