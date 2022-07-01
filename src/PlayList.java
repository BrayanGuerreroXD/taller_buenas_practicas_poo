import java.util.ArrayList;

public interface PlayList {
    ArrayList<Song> filterByGender(String gender);
    ArrayList<Song> filterByYear(int year);
}
