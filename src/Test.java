import java.util.ArrayList;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Pumped Up Kicks", 1, 2011,
                3.59F, "Alternative", "covers/torches_ftp_cover.jpg",
                "song of Foster The People"));

        songs.add(new Song("Sweater Weather ", 2, 2013,
                4.00F, "Rock", "covers/iloveyou_tn_cover.jpg",
                "song of The Neighbourhood"));
    }
}
