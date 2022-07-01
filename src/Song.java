import java.util.Date;

public class Song {
    private String title;
    private int id;
    private Date date;
    private float duration;
    private String gender;
    private String cover;
    private String description;

    public Song(String title, int id, Date date, float duration, String gender, String cover, String description) {
        this.title = title;
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.gender = gender;
        this.cover = cover;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", date=" + date +
                ", duration=" + duration +
                ", gender='" + gender + '\'' +
                ", cover='" + cover + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
