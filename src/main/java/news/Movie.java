package news;

public class Movie {
    private String title;
    private int rating;

    //getter
    public String getTitle() {
        return this.title;
    }
    //setter
    public void setTitle (String titlePassToMain) {
        this.title = titlePassToMain;
    }
    // getter for rating

    public int getRating() {
        return this.rating;
    }
    //setter for rating

    public void setRating(int ratingPassToMain){
        this.rating = ratingPassToMain;

    }
}


