package bridge.remote;

import bridge.device.Device;

public abstract class RemoteControl {
    private final Device device;
    public boolean isPoweredOn = false;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public Device getDevice() {
        return device;
    }

    public abstract void power();
    public abstract void setChannel(int channel);
    public abstract void setVolume(int volume);
}
