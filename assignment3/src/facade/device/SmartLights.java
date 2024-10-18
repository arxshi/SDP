package facade.device;

public class SmartLights {
    public void turnOn() {
        System.out.println("Smart Lights: ON");
    }

    public void turnOff() {
        System.out.println("Smart Lights: OFF");
    }

    public void dim(int level) {
        System.out.println("Smart Lights dimmed to " + level + "%");
    }
}
