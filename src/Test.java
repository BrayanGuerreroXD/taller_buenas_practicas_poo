import java.util.ArrayList;

/**
 * The main class test creates a manually typed song library
 *
 * @version 1.0.0 2022-07-02
 *
 * @author Brayan Stewart Guerrero Ordoñez – bg7047653@gmail.com
 *         Moises Bernal - moisesb95@hotmail.com
 *
 * @since 1.0.0 2022-07-02
 *
 */

public class Test {

    public static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<>();

        //manual creation of songs library starts here

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

        songs.add(new Song("Centuries", 10, 2014,
                3.48F, "Alternative", "covers/centuries_cover.jpg",
                "song of Fall Out Boy"));

        songs.add(new Song("Sunflower", 11, 2018,
                2.38F, "Hip Hop", "covers/Sunflower_cover.jpg",
                "song of Post Malone"));

        songs.add(new Song("Stressed Out", 12, 2015,
                3.22F, "Alternative", "covers/stressed_out_cover.jpg",
                "song of Twenty One Pilots"));

        songs.add(new Song("Veronica", 13, 2010,
                4.13F, "Rock Espanol", "covers/veronica_cover.jpg",
                "song of Caramelos de Cianuro"));

        songs.add(new Song("Crimen", 14, 2006,
                3.28F, "Rock Espanol", "covers/crimen_cover.jpg",
                "song of Gustavo Cerati"));

        songs.add(new Song("Bohemian Rhapsody", 15, 1975,
                5.54F, "Rock", "covers/bohemian_rhapsody_cover.jpg",
                "song of Queen"));

        songs.add(new Song("Under the Bridge", 16, 1992,
                4.24F, "Rock", "covers/under_the_bridge_cover.jpg",
                "song of Gustavo Red Hot Chili Peppers"));

        songs.add(new Song("Yonaguni", 17, 2021,
                3.28F, "Reggaeton", "covers/yonaguni_cover.jpg",
                "song of bad Bunny"));

        songs.add(new Song("Rapper's Delight", 18, 2009,
                7.10F, "Hip Hop", "covers/rappers_delight_cover.jpg",
                "song of Sugarhill Gang"));

        //end of songs library creation

        Library library = new Library(songs);

        System.out.println("Filtrar por genero:");

        library.filterByGender("Alternative").forEach(System.out::println);

        System.out.println("Filtrar por año:");

        library.filterByYear(2021).forEach(System.out::println);
    }
}
