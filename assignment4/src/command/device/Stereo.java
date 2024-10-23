package command.device;

public class Stereo {
    private int volume = 10;

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Stereo volume set to " + volume);
    }

    public int getVolume() {
        return volume;
    }
}
