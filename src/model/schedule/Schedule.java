package model.schedule;

public interface Schedule {
    public Schedule clone();
    public void setTime(String time);
    public String getTime();
}
