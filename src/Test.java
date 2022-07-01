import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Pumped Up Kicks", 1, 2011,
                3.59F, "Alternative", "covers/torches_ftp_cover.jpg",
                "Song of Foster The People"));

        songs.add(new Song("Sweater Weather", 2, 2013,
                4.00F, "Rock", "covers/iloveyou_tn_cover.jpg",
                "Song of The Neighbourhood"));

        songs.add(new Song("Heavydirtysoul", 3, 2015,
                3.54F, "Rock", "covers/blurryface_cover.jpg",
                "Song of Twenty One Pilots"));

        songs.add(new Song("Sit Next to Me", 4, 2017,
                4.03F, "Alternative", "covers/Sacred_Hearts_Club_cover.jpg",
                "Song of Foster The People"));

        songs.add(new Song("Daddy Issues", 5, 2015,
                4.20F, "Alternative", "covers/wiped_out_cover.jpg",
                "Song of The Neighbourhood"));

        songs.add(new Song("The Beach", 6, 2015,
                4.15F, "Rock", "covers/wiped_out_cover.jpg",
                "Song of The Neighbourhood"));

        songs.add(new Song("Me Porto Bonito", 7, 2022,
                2.58F, "Reggaeton", "covers/un_verano_sin_ti_cover.jpg",
                "Song of Bad Bunny"));

        songs.add(new Song("Te Felicito", 8, 2022,
                2.52F, "Reggaeton", "covers/te_felicito_cover.jpeg",
                "song of Shakira and Rauw Alejandro"));

        songs.add(new Song("Dos Mil 16", 9, 2022,
                3.28F, "Reggaeton", "covers/un_verano_sin_ti_cover.jpg",
                "song of Bad Bunny"));
    }
}
