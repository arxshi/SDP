package bridge.remote;

import bridge.device.Device;

public class AdvancedRemote extends RemoteControl {

    private boolean isMuted = false;

    public AdvancedRemote(Device device) {
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

    public void mute() {
        if(isMuted) {
            System.out.println("Unmutting device.");
        } else {
            System.out.println("Mutting device.");
        }
        isMuted = !isMuted;
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
