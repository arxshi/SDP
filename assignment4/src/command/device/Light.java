package command.device;

public class Light {
    private int brightness = 100;

    public void dim(int brightness) {
        this.brightness = brightness;
        System.out.println("Light brightness set to " + brightness);
    }

    public int getBrightness() {
        return brightness;
    }
}