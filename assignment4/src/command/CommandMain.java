package command;

import command.device.Light;
import command.device.Stereo;
import command.device.TV;

public class CommandMain {
    public static void main(String[] args) {

        TV tv = new TV();
        // previous values are set in classes itself
        Stereo stereo = new Stereo();
        Light light = new Light();

        Command turnTVOn = new TurnTVOn(tv);
        Command setVolume = new SetVolume(stereo, 15);
        Command dimLights = new DimLights(light, 50);

        RemoteControl remote = new RemoteControl(3);
        remote.setCommand(0, turnTVOn);
        remote.setCommand(1, setVolume);
        remote.setCommand(2, dimLights);

        remote.pressButton(0);
        remote.pressButton(1);
        remote.pressButton(2);

        remote.pressUndo();
        remote.pressUndo();
        remote.pressUndo();
    }
}
