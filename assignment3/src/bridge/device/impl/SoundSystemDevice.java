package bridge.device.impl;

import bridge.device.Device;

public class SoundSystemDevice implements Device {

    @Override
    public void powerOn() {
        System.out.println("Turning on Sound system device.");
    }

    @Override
    public void powerOff() {
        System.out.println("Turning off Sound system device.");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sound system devices do not support channels.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Sound system device's volume set to " + volume);
    }

}
