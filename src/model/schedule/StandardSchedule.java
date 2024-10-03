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
        try {
            StandardSchedule clone = (StandardSchedule) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
