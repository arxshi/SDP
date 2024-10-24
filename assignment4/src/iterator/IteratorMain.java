package iterator;

public class IteratorMain {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song 1", "Artist A", "Rock"));
        playlist.addSong(new Song("Song 2", "Artist B", "Pop"));
        playlist.addSong(new Song("Song 3", "Artist A", "Rock"));
        playlist.addSong(new Song("Song 4", "Artist C", "Jazz"));
        playlist.addSong(new Song("Song 5", "Artist D", "Pop"));

        System.out.println("Sequential Iterator:");
        Iterator<Song> sequentialIterator = playlist.createSequentialIterator();
        while (sequentialIterator.hasNext()) {
            System.out.println(sequentialIterator.next());
        }

        System.out.println();

        System.out.println("Shuffle Iterator:");
        Iterator<Song> shuffleIterator = playlist.createShuffleIterator();
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }

        System.out.println();

        System.out.println("Genre Filter Iterator (Rock):");
        Iterator<Song> rockIterator = playlist.createGenreFilterIterator("Rock");
        while (rockIterator.hasNext()) {
            System.out.println(rockIterator.next());
        }
    }
}

