package config;

public class CinemaConfig {

    private static CinemaConfig instance;
    private String cinemaName;
    private CinemaConfig() {}

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public static CinemaConfig getConfig() {
        if(instance == null) {
            instance = new CinemaConfig();
        }
        return instance;
    }

}
