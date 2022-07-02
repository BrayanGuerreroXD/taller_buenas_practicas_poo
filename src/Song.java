/**
 * Class that represents a song with various information such as title, song gender, song duration.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author Brayan Stewart Guerrero Ordoñez – bg7047653@gmail.com
 *         Moises Bernal - moisesb95@hotmail.com
 *
 * @since 1.0.0 2022-07-02
 *
 */

public class Song {
    private String title;
    private int id;
    private int year;
    private float duration;
    private String gender;
    private String cover;
    private String description;

    /**
     * Setting up native variables of the song object with the following information:
     * @param title of the song
     * @param id of the typing order of the songs
     * @param year in which the song was released
     * @param duration of the song
     * @param gender of the song
     * @param cover of the song single or album
     * @param description of the song which tells its author
     */

    public Song(String title, int id, int year, float duration, String gender, String cover, String description) {
        this.title = title;
        this.id = id;
        this.year = year;
        this.duration = duration;
        this.gender = gender;
        this.cover = cover;
        this.description = description;
    }

    /**
     * getTitle method to
     * @return the value of the song title
     */
    public String getTitle() {
        return title;
    }

    /**
     * getId method to
     * @return the id of the song
     */
    public int getId() {
        return id;
    }

    /**
     * setId method to set the
     * @param id of the actual song
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getYear method to
     * @return the year of the song
     */
    public int getYear() {
        return year;
    }

    /**
     * getDuration method to
     * @return the duration of the actual song
     */
    public float getDuration() {
        return duration;
    }

    /**
     * getGender method to
     * @return the gender of the actual song
     */
    public String getGender() {
        return gender;
    }

    /**
     * getCover methods to
     * @return the cover of the actual song
     */
    public String getCover() {
        return cover;
    }

    /**
     * getDescription method to
     * @return the description of the actual song with the author information
     */
    public String getDescription() {
        return description;
    }

    /**
     * method to
     * @return a string with all the information related to the object song
     */

    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", year=" + year +
                ", duration=" + duration +
                ", gender='" + gender + '\'' +
                ", cover='" + cover + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
