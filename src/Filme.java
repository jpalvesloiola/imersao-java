

public class Filme {
    private long id;
    private int rank, year;
    private String title, fullTitle, image;
    private String[] crew;
    private float imDbRating, imDbRatingCount;
        
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getFullTitle() {
        return fullTitle;
    }
    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String[] getCrew() {
        return crew;
    }
    public void setCrew(String[] crew) {
        this.crew = crew;
    }
    public float getImDbRating() {
        return imDbRating;
    }
    public void setImDbRating(float imDbRating) {
        this.imDbRating = imDbRating;
    }
    public float getImDbRatingCount() {
        return imDbRatingCount;
    }
    public void setImDbRatingCount(float imDbRatingCount) {
        this.imDbRatingCount = imDbRatingCount;
    }

    
}
