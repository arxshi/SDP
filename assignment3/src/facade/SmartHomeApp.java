package facade;

import facade.device.EntertainmentSystem;
import facade.device.SecuritySystem;
import facade.device.SmartLights;
import facade.device.Thermostat;

public class SmartHomeApp {
    public static void main(String[] args) {
        SmartLights lights = new SmartLights();
        Thermostat thermostat = new Thermostat();
        SecuritySystem securitySystem = new SecuritySystem();
        EntertainmentSystem entertainmentSystem = new EntertainmentSystem();

        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(lights, thermostat, securitySystem, entertainmentSystem);

        smartHomeFacade.arriveHome();
        smartHomeFacade.movieMode();
        smartHomeFacade.nightMode();
        smartHomeFacade.leaveHome();
    }
}
