package iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public Iterator<Song> createSequentialIterator() {
        return new SequentialIterator(this);
    }

    public Iterator<Song> createShuffleIterator() {
        return new ShuffleIterator(this);
    }

    public Iterator<Song> createGenreFilterIterator(String genre) {
        return new GenreFilterIterator(this, genre);
    }
}

