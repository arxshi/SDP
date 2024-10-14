package adapter.player.impl;

import adapter.player.AACPlayer;
import adapter.player.WAVPlayer;

public class AdvancedAudioPlayer implements WAVPlayer, AACPlayer {
    @Override
    public void playAAC(String fileName) {
        System.out.println("Playing " + fileName + " with acc audio type");
    }

    @Override
    public void playWAV(String fileName) {
        System.out.println("Playing " + fileName + " with wav audio type");
    }
}
