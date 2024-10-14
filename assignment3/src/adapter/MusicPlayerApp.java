package adapter;

import adapter.player.AudioPlayer;
import adapter.player.impl.MP3Player;

public class MusicPlayerApp {

    public static void main(String[] args) {
        AudioPlayer player = new MP3Player();

        player.play("mp3", "song1.mp3");

        AudioPlayer wavPlayer = new AudioAdapter("wav");
        wavPlayer.play("wav", "song2.wav");

        AudioPlayer aacPlayer = new AudioAdapter("aac");
        aacPlayer.play("aac", "song3.aac");
    }

}
