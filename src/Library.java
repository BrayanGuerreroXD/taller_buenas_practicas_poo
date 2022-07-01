import java.util.ArrayList;

public class Library implements PlayList {
    private ArrayList<Song> songs = new ArrayList<Song>();

    public Library(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    @Override
    public ArrayList<Song> filterByGender(String gender) {
        ArrayList<Song> filterList = new ArrayList<Song>();

        for(Song song: this.getSongs()){
            if(song.getGender().equals(gender)){
                filterList.add(song);
            }
        }

        return filterList;
    }

    @Override
    public ArrayList<Song> filterByYear(int year) {
        ArrayList<Song> filterList = new ArrayList<Song>();

        for(Song song: this.getSongs()){
            if(song.getDate().getYear() == year){
                filterList.add(song);
            }
        }

        return filterList;
    }
}
