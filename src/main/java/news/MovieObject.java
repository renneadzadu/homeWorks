package news;

public class MovieObject {
        public static void main(String[] args) {
            Movie title1  = new Movie();
            title1.setTitle ("lion king");
            Movie rating  = new Movie();
            rating.setRating(8);
            System.out.println(title1.getTitle() +" "+rating.getRating());


    }
}
