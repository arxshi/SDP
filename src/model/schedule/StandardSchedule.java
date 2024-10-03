package model.schedule;

public class StandardSchedule implements Schedule {

    private String time;
    public StandardSchedule(String time) {
        this.time = time;
    }

    public StandardSchedule() {
    }

    @Override
    public MovieSchedule clone() {
        return new MovieSchedule(this.time);
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getTime() {
        return time;
    }

}
