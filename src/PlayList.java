import java.util.ArrayList;

/**
 * Playlist interface with the abstract methods to filter by gender and filter by  year
 */
public interface PlayList {
    ArrayList<Song> filterByGender(String gender);
    ArrayList<Song> filterByYear(int year);
}
