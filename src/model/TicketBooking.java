package model;

public class TicketBooking {

    private final String movieTitle;
    private final String seatNumber;
    private final String snackCombo;

    public TicketBooking(TicketBookingBuilder ticketBookingBuilder) {
        this.movieTitle = ticketBookingBuilder.getMovieTitle();
        this.seatNumber = ticketBookingBuilder.getSeatNumber();
        this.snackCombo = ticketBookingBuilder.getSnackCombo();
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getSnackCombo() {
        return snackCombo;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public static class TicketBookingBuilder {

        private String movieTitle;
        private String seatNumber;
        private String snackCombo;

        public TicketBookingBuilder setMovieTitle(String title) {
            this.movieTitle = title;
            return this;
        }

        public TicketBookingBuilder setSeatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
            return this;
        }

        public TicketBookingBuilder setSnackCombo(String combo) {
            this.snackCombo = combo;
            return this;
        }

        public TicketBooking build() {
            return new TicketBooking(this);
        }

        public String getMovieTitle() {
            return movieTitle;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public String getSnackCombo() {
            return snackCombo;
        }
    }

}
