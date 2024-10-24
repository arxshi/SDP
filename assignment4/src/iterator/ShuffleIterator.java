package iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleIterator implements Iterator<Song> {
    private List<Song> songs;
    private int currentIndex;
    private List<Song> shuffledSongs;

    public ShuffleIterator(Playlist playlist) {
        this.songs = playlist.getSongs();
        this.shuffledSongs = new ArrayList<>(songs);
        Collections.shuffle(shuffledSongs, new Random());
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < shuffledSongs.size();
    }

    @Override
    public Song next() {
        return shuffledSongs.get(currentIndex++);
    }
}

