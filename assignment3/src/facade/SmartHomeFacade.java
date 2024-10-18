package facade;

import facade.device.EntertainmentSystem;
import facade.device.SecuritySystem;
import facade.device.SmartLights;
import facade.device.Thermostat;

public class SmartHomeFacade {
    private SmartLights lights;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade(
            SmartLights lights,
            Thermostat thermostat,
            SecuritySystem securitySystem,
            EntertainmentSystem entertainmentSystem
    ) {
        this.lights = lights;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void leaveHome() {
        System.out.println("\nLeaving Home...");
        lights.turnOff();
        thermostat.setTemperature(18);
        securitySystem.arm();
        entertainmentSystem.turnOff();
    }

    public void arriveHome() {
        System.out.println("\nArriving Home...");
        lights.turnOn();
        thermostat.setTemperature(22);
        securitySystem.disarm();
    }

    public void nightMode() {
        System.out.println("\nNight Mode...");
        lights.dim(10);
        thermostat.setTemperature(20);
        securitySystem.arm();
    }

    public void movieMode() {
        System.out.println("\nMovie Mode...");
        lights.dim(30);
        entertainmentSystem.turnOn();
        entertainmentSystem.setMovieMode();
    }
}
