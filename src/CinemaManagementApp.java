import config.CinemaConfig;
import factory.button.DarkThemeFactory;
import factory.movie.MovieFactory;
import factory.movie.RegularMovieFactory;
import factory.button.UIFactory;
import model.button.Button;
import model.TicketBooking;
import model.movie.Movie;
import model.schedule.MovieSchedule;
import model.schedule.StandardSchedule;

public class CinemaManagementApp {

    public static void main(String[] args) {

        // Singleton usage
        CinemaConfig config = CinemaConfig.getConfig();
        config.setCinemaName("Starlight Cinemas");
        System.out.println("Cinema Name: " + config.getCinemaName());

        // Factory Method usage
        MovieFactory regularFactory = new RegularMovieFactory();
        Movie movie = regularFactory.createMovie("Inception");
        System.out.println("Movie: " + movie.getTitle() + ", Type: " + movie.getType());

        // Abstract Factory usage
        UIFactory uiFactory = new DarkThemeFactory();
        Button button = uiFactory.createButton();
        button.render();

        // Builder usage
        TicketBooking booking = new TicketBooking.TicketBookingBuilder()
                .setMovieTitle("Inception")
                .setSeatNumber("A1")
                .setSnackCombo("Popcorn and Soda")
                .build();

        // Prototype usage
        StandardSchedule template = new StandardSchedule();
        template.setTime("18:00");
        MovieSchedule eveningSchedule = template.clone();
        eveningSchedule.setMovie(movie);
        System.out.println("Cinema Management System initialized.");
    }

}
