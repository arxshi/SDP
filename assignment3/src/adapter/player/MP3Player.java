package adapter.player;

public class MP3Player implements AudioPlayer {
    @Override
    public void play(String audioType, String fileName) {
        System.out.println("Playing " + fileName + " with " + audioType + " audio type");
    }
}
