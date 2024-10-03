package model.schedule;

public class StandardSchedule implements Cloneable {

    private String time;
    public StandardSchedule(String time) {
        this.time = time;
    }

    public StandardSchedule() {
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getTime() {
        return time;
    }

    @Override
    public StandardSchedule clone() {
        return new StandardSchedule(this.time);
    }
}
