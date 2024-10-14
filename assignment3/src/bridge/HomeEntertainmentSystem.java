package bridge;

import bridge.device.impl.DVDDevice;
import bridge.device.Device;
import bridge.device.impl.SoundSystemDevice;
import bridge.device.impl.TVDevice;
import bridge.remote.AdvancedRemote;
import bridge.remote.BasicRemote;
import bridge.remote.RemoteControl;

public class HomeEntertainmentSystem {
    public static void main(String[] args) {
        System.out.println("\nTV with basic remote control:");
        Device tv = new TVDevice();
        RemoteControl basicRemote = new BasicRemote(tv);

        basicRemote.power();
        basicRemote.setChannel(5);
        basicRemote.setVolume(20);
        basicRemote.power();

        System.out.println("\nDVD with advanced remote control:");
        Device dvdPlayer = new DVDDevice();
        AdvancedRemote advancedRemote = new AdvancedRemote(dvdPlayer);

        advancedRemote.power();
        advancedRemote.setVolume(15);
        advancedRemote.mute();
        advancedRemote.mute();
        advancedRemote.power();

        System.out.println("\nSound system with advanced remote control:");
        Device soundSystem = new SoundSystemDevice();
        RemoteControl advancedRemoteForSoundSystem = new AdvancedRemote(soundSystem);

        advancedRemoteForSoundSystem.power();
        advancedRemoteForSoundSystem.setVolume(25);
        ((AdvancedRemote) advancedRemoteForSoundSystem).mute();
    }
}
