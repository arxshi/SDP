package bridge.device.impl;

import bridge.device.Device;

public class DVDDevice implements Device {
    @Override
    public void powerOn() {
        System.out.println("Turning on DVD device.");
    }

    @Override
    public void powerOff() {
        System.out.println("Turning off DVD device.");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("DVD devices do not support channels.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("DVD device's volume set to " + volume);
    }
}
