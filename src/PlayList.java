import java.util.ArrayList;

/**
 * Playlist interface with the abstract methods to filter by gender and filter by  year
 *
 * @version 1.0.0 2022-07-02
 *
 * @author Brayan Stewart Guerrero Ordoñez – bg7047653@gmail.com
 *         Moises Bernal - moisesb95@hotmail.com
 *
 * @since 1.0.0 2022-07-02
 *
 */

public interface PlayList {
    ArrayList<Song> filterByGender(String gender);
    ArrayList<Song> filterByYear(int year);
    void orderByDuration();
    void orderByYear();
}
