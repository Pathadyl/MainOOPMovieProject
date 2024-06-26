package model;

public class Movie {
    private int id;
    private String title;
    private String description;
    private String director;
    private String genre;
    private String duration;
    private double price;
    private String posterPath;
    private String coverPath;
    private boolean visibility;
    private boolean availability;

    public Movie(int id, String title, String description, String director, String genre,
                 String duration, double price, String posterPath, String coverPath,
                 boolean visibility, boolean availability) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.director = director;
        this.genre = genre;
        this.duration = duration;
        this.price = price;
        this.visibility = visibility;
        this.availability = availability;
        this.posterPath = posterPath;
        this.coverPath = coverPath;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }
    
    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
