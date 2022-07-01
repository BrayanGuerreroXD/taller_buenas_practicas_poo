import java.util.ArrayList;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Pumped Up Kicks", 1, new Date(1306108800000),
                3.59, "Alternative", "covers/torches_ftp_cover.jpg",
                "song of Foster The People"));

        songs.add(new Song("Sweater Weather ", 2, new Date(1366329600000),
                4.00, "Rock", "covers/iloveyou_tn_cover.jpg",
                "song of The Neighbourhood"));
    }
}
