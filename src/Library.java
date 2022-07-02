import java.util.ArrayList;


/**
 * Library class which implements playlist interface (abstract methods filterbyGender an filterbyYear)
 * represents a list of song (object) selected by the user
 */

public class Library implements PlayList {
    private final ArrayList<Song> songs;

    public Library(ArrayList<Song> songs) {
        this.songs = songs;
    }

    /**
     * method getSongs to
     * @return the arrayList with the songs in the library
     */

    public ArrayList<Song> getSongs() {
        return songs;
    }

    /**
     * Method createPlayList using the
     * @param list with the names of the song to add to the playlist and then
     * @return the object playlist with the songs (objects) to include in it
     */

    public ArrayList<Song> createPlayList(ArrayList<String> list) {
        ArrayList<Song> playlist = new ArrayList<>();

        for(String name: list) {
            for(Song song: this.getSongs()) {
                if(song.getTitle().equals(name)) {
                    playlist.add(song);
                }
            }
        }

        return playlist;
    }

    /**
     * First abstract method to implement from the interface playlist using the
     * @param gender of the songs to
     * @return a Playlist with the songs that shares that gender
     */


    @Override
    public ArrayList<Song> filterByGender(String gender) {
        ArrayList<Song> filterList = new ArrayList<>();

        for(Song song: this.getSongs()){
            if(song.getGender().equals(gender)){
                filterList.add(song);
            }
        }

        return filterList;
    }

    /**
     * Second abstract method  implemented from the interface playlist using the
     * @param year of the songs to
     * @return a Playlist with the songs that shares the same year
     */

    @Override
    public ArrayList<Song> filterByYear(int year) {
        ArrayList<Song> filterList = new ArrayList<>();

        for(Song song: this.getSongs()) {
            if(song.getYear() == year) {
                filterList.add(song);
            }
        }

        return filterList;
    }
}
