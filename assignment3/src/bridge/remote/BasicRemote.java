package bridge.remote;

import bridge.device.Device;

public class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void power() {
        if(isPoweredOn) {
            getDevice().powerOff();
        } else {
            getDevice().powerOn();
        }
        isPoweredOn = !isPoweredOn;
    }
    @Override
    public void setVolume(int volume) {
        getDevice().setVolume(volume);
    }
    @Override
    public void setChannel(int channel) {
        getDevice().setChannel(channel);
    }
}
