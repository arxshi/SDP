package bridge.device.impl;

import bridge.device.Device;

public class TVDevice implements Device {
    @Override
    public void powerOn() {
        System.out.println("Turning on TV device.");
    }

    @Override
    public void powerOff() {
        System.out.println("Turning off TV device.");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("TV device's channel set to " + channel);
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("TV device's volume set to " + volume);
    }
}
