package iterator;

public class GenreFilterIterator implements Iterator<Song> {
    private Playlist playlist;
    private String genre;
    private int currentIndex;

    public GenreFilterIterator(Playlist playlist, String genre) {
        this.playlist = playlist;
        this.genre = genre;
        this.currentIndex = 0;

        // move to the first song of the specified genre
        while (currentIndex < playlist.getSongs().size() &&
                !playlist.getSongs().get(currentIndex).getGenre().equals(genre)) {
            currentIndex++;
        }
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < playlist.getSongs().size() &&
                !playlist.getSongs().get(currentIndex).getGenre().equals(genre)) {
            currentIndex++;
        }
        return currentIndex < playlist.getSongs().size();
    }

    @Override
    public Song next() {
        return playlist.getSongs().get(currentIndex++);
    }
}

