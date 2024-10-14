package adapter.player.impl;

import adapter.player.AudioPlayer;

public class MP3Player implements AudioPlayer {
    @Override
    public void play(String audioType, String fileName) {
        System.out.println("Playing " + fileName + " with " + audioType + " audio type");
    }
}
